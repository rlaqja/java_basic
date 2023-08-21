package com.kim.Quartz.Controller;


import lombok.extern.slf4j.Slf4j;
import org.quartz.JobKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kim.Quartz.Job.CronJob;
import com.kim.Quartz.Job.SimpleJob;
import com.kim.Quartz.Service.ScheduleService;
import com.kim.Quartz.VO.ApiResponse;
import com.kim.Quartz.VO.JobRequest;
import com.kim.Quartz.VO.JobStatusResponse;

@Slf4j
@RestController
@RequestMapping("/scheduler")
public class ScheduleController {

	@Autowired
	private ScheduleService scheduleService;

	@RequestMapping(value = "/job", method = RequestMethod.POST)
	public ResponseEntity<?> addScheduleJob(@ModelAttribute JobRequest jobRequest) {
		log.debug("add schedule job :: jobRequest : {}", jobRequest);
		if (jobRequest.getJobName() == null) {
			return new ResponseEntity<>(new ApiResponse(false, "Require jobName"),
					HttpStatus.BAD_REQUEST);
		}

		JobKey jobKey = new JobKey(jobRequest.getJobName(), jobRequest.getJobGroup());
		if (!scheduleService.isJobExists(jobKey)) {
			if (jobRequest.getCronExpression() == null) {
				scheduleService.addJob(jobRequest, SimpleJob.class);
			} else {
				scheduleService.addJob(jobRequest, CronJob.class);
			}
		} else {
			return new ResponseEntity<>(new ApiResponse(false, "Job already exits"),
					HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(new ApiResponse(true, "Job created successfully"), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/job", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteScheduleJob(@ModelAttribute JobRequest jobRequest) {
		JobKey jobKey = new JobKey(jobRequest.getJobName(), jobRequest.getJobGroup());
		if (scheduleService.isJobExists(jobKey)) {
			if (!scheduleService.isJobRunning(jobKey)) {
				scheduleService.deleteJob(jobKey);
			} else {
				return new ResponseEntity<>(new ApiResponse(false, "Job already in running state"), HttpStatus.BAD_REQUEST);
			}
		} else {
			return new ResponseEntity<>(new ApiResponse(false, "Job does not exits"), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(new ApiResponse(true, "Job deleted successfully"), HttpStatus.OK);
	}

	@RequestMapping(value = "/jobs", method = RequestMethod.GET)
	public JobStatusResponse getAllJobs() {
		return scheduleService.getAllJobs();
		//getAllJobs이게 안되어서 s를 빼봄  만약 오류가 발생하면 여기도 기억하기
	}
	
	@RequestMapping(value = "/job/pause", method = RequestMethod.PUT)
	public ResponseEntity<?> pauseJob(@ModelAttribute JobRequest jobRequest) {
		JobKey jobKey = new JobKey(jobRequest.getJobName(), jobRequest.getJobGroup());
		if (scheduleService.isJobExists(jobKey)) {
			if (!scheduleService.isJobRunning(jobKey)) {
				scheduleService.pauseJob(jobKey);
			} else {
				return new ResponseEntity<>(new ApiResponse(false, "Job already in running state"), HttpStatus.BAD_REQUEST);
			}
		} else {
			return new ResponseEntity<>(new ApiResponse(false, "Job does not exits"), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(new ApiResponse(true, "Job paused successfully"), HttpStatus.OK);
	}

	@RequestMapping(value = "/job/resume", method = RequestMethod.PUT)
	public ResponseEntity<?> resumeJob(@ModelAttribute JobRequest jobRequest) {
		JobKey jobKey = new JobKey(jobRequest.getJobName(), jobRequest.getJobGroup());
		if (scheduleService.isJobExists(jobKey)) {
		    String jobState = scheduleService.getJobState(jobKey);

			if (jobState.equals("PAUSED")) {
				scheduleService.resumeJob(jobKey);
			} else {
                return new ResponseEntity<>(new ApiResponse(false, "Job is not in paused state"), HttpStatus.BAD_REQUEST);
			}
		} else {
            return new ResponseEntity<>(new ApiResponse(false, "Job does not exits"), HttpStatus.BAD_REQUEST);
		}
        return new ResponseEntity<>(new ApiResponse(true, "Job resumed successfully"), HttpStatus.OK);
	}
}
