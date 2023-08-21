package com.kim.Quartz.VO;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.kim.Quartz.model.JobType;

public class JobRequestTest {
	
	@Test
	public void isjobTypeSimple_getCurrentJobType_cronType() {
		JobRequest jobRequest = new JobRequest();
		jobRequest.setCronExpression("0/10 * * ? * *");
		assertThat(jobRequest.isJobTypeSimple()).isFalse();
		assertThat(jobRequest.getCurrentJobType()).isEqualTo(JobType.CRON);
	}
	
	@Test
	public void isJobTypeSimple_getCurrentJobType_simpleType() {
		JobRequest jobRequest = new JobRequest();
		jobRequest.setRepeatCount(1);
		jobRequest.setRepeatIntervalInSeconds(1);
		assertThat(jobRequest.isJobTypeSimple()).isTrue();
		assertThat(jobRequest.getCurrentJobType()).isEqualTo(JobType.SIMPLE);
	}
}
