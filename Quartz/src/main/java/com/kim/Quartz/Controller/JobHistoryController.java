package com.kim.Quartz.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kim.Quartz.Service.JobHistoryService;
import com.kim.Quartz.model.JobStatus;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/history")
public class JobHistoryController {

	@Autowired
	private JobHistoryService jobHistoryService;
	
	public Page<JobStatus> getAllHistoryStatusJobs(Pageable pageable) {
		return jobHistoryService.getAllJobs(pageable);
	}
	
}
