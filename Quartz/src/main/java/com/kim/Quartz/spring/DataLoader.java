package com.kim.Quartz.spring;

import java.time.LocalDateTime;

import org.quartz.JobDataMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.kim.Quartz.Job.CronJob;
import com.kim.Quartz.Job.CronJob2;
import com.kim.Quartz.Job.SimpleJob;
import com.kim.Quartz.Service.ScheduleService;
import com.kim.Quartz.VO.JobRequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private ScheduleService scheduleService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //simple job 생성
        JobRequest jobRequest = new JobRequest();
        jobRequest.setJobName("simpleJob");
        jobRequest.setStartDateAt(LocalDateTime.now());
        jobRequest.setRepeatCount(50);
        jobRequest.setRepeatIntervalInSeconds(30);
        scheduleService.addJob(jobRequest, SimpleJob.class);

        //cron job 생성
        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("jobId", "123456789");
        jobRequest = new JobRequest();
        jobRequest.setJobName("cronJob1");
        jobRequest.setCronExpression("0 * * ? * *"); //every min
        jobRequest.setJobDataMap(jobDataMap);
        scheduleService.addJob(jobRequest, CronJob.class);

//        jobRequest = new JobRequest();
//        jobRequest.setJobName("cronJob2");
//        jobRequest.setCronExpression("0 */5 * ? * *"); //every 5 min
//        scheduleService.addJob(jobRequest, CronJob2.class);

	}
}
