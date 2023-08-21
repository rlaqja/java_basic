package com.kim.Quartz.Job;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.springframework.scheduling.quartz.QuartzJobBean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CronJob extends QuartzJobBean{
	private int MAX_SLEEP_IN_SECONDS = 5;
	private volatile Thread currThread;
	
	
	@Override
	public void executeInternal(JobExecutionContext context)throws JobExecutionException {
		// TODO Auto-generated method stub
		JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
		int jobId = jobDataMap.getInt("jobId");
		JobKey jobkey = context.getJobDetail().getKey();
		
		currThread = Thread.currentThread();
		log.info("==========================================================");
		log.info("CronJob started :: sleep : {} jobId : {}jobKey : {} - {}",MAX_SLEEP_IN_SECONDS,jobId, jobkey,currThread.getName());

		IntStream.range(0, 5).forEach(i->{
		log.info("CronJob Counting - {}", i);
		try {
			TimeUnit.SECONDS.sleep(MAX_SLEEP_IN_SECONDS);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		});
		log.info("CronJob ended :: jobKey : {} - {}", jobkey,currThread.getName());
		log.info("==========================================================");
		
	}
	
	
}
