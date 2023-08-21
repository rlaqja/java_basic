package com.kim.Quartz.Service;

import org.quartz.Job;
import org.quartz.JobKey;

import com.kim.Quartz.VO.JobRequest;
import com.kim.Quartz.VO.JobStatusResponse;

public interface ScheduleService {

	
	boolean isJobRunning(JobKey jobKey);
	
	boolean isJobExists(JobKey jobKey);
	
	boolean addJob(JobRequest jobRequest, Class<? extends Job>jobClass);
	
	boolean deleteJob(JobKey jobKey);
	
	boolean pauseJob(JobKey jobKey);
	
	boolean resumeJob(JobKey jobKey);
	
	String getJobState(JobKey jobKey);

	JobStatusResponse getAllJobs();
	
	
}
