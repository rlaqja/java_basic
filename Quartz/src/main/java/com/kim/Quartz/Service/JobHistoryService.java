package com.kim.Quartz.Service;

import java.util.Date;

import javax.transaction.Transactional;

import org.quartz.JobKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kim.Quartz.Exception.ResourceNotFoundException;
import com.kim.Quartz.Repository.JobHistoryRepository;
import com.kim.Quartz.Repository.JobStatusRepository;
import com.kim.Quartz.VO.JobRequest;
import com.kim.Quartz.model.JobHistory;
import com.kim.Quartz.model.JobStatus;
import com.kim.Quartz.model.StateType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("jobHistoryService")
public class JobHistoryService {
	
	@Autowired
	private JobHistoryRepository jobHistoryRepository;
	
	@Autowired
	private JobStatusRepository jobStatusRepository;
	
	public JobHistory addJob(JobRequest jobRequest) {
        JobHistory jobHistory = new JobHistory();
        jobHistory.setJobName(jobRequest.getJobName());
        jobHistory.setJobGroup(jobRequest.getJobGroup());
        jobHistory.setJobType(jobRequest.getCurrentJobType());
        jobHistory = jobHistoryRepository.save(jobHistory);

        JobStatus jobStatus = new JobStatus();
        jobStatus.setJobState(StateType.CREATE);
        jobStatus.setJobHistory(jobHistory);
        jobStatusRepository.save(jobStatus);
        return jobHistory;
    }
	
	public JobStatus deleteJob(JobKey jobKey) {
		return saveJobStatus(jobKey, StateType.DELETE);
	}
	public JobStatus updateJob(JobKey jobKey) {
		return saveJobStatus(jobKey, StateType.UPDATE);
	}
	public JobStatus pauseJob(JobKey jobKey) {
		return saveJobStatus(jobKey, StateType.PAUSE);
	}
	public JobStatus resumeJob(JobKey jobKey) {
		return saveJobStatus(jobKey, StateType.RESUME);
	}
	public JobStatus stopJob(JobKey jobKey) {
		return saveJobStatus(jobKey, StateType.STOP);
	}
	@Transactional
	public Page<JobStatus> getAllJobs(Pageable pageable){
	  Page<JobStatus> jobStatusPage = jobStatusRepository.findAll(pageable);
		
	  return jobStatusPage;	
	}
	
	private JobStatus saveJobStatus(JobKey jobKey,StateType delete) {
		JobHistory jobHistory = jobHistoryRepository
		.findFirestByJobNameAndJobGroupOrderByHistoryIdDesc(jobKey.getName(), jobKey.getGroup())
		.orElseThrow(()-> new ResourceNotFoundException("jobKey" + jobKey + "not found"));		
	jobHistory.setUpdateDt(new Date());
	
	jobHistoryRepository.save(jobHistory);
	
	JobStatus jobStatus = new JobStatus();
	jobStatus.setJobState(delete);
	jobStatus.setJobHistory(jobHistory);
	return jobStatusRepository.save(jobStatus);
	}
}
