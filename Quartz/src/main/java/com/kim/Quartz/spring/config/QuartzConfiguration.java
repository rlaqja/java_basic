package com.kim.Quartz.spring.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.quartz.TriggerListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.kim.Quartz.Service.JobsListener;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class QuartzConfiguration {
	
	@Autowired
	private TriggerListener triggersListener;
	
	@Autowired
	private JobsListener jobsListener;
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private QuartzProperties quartzProperties;
	
	@Bean
	public SchedulerFactoryBean schedulerFactoryBean(ApplicationContext applicationContext) {
		SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();

		AutowiringSpringBeanJobFactory jobFactory = new AutowiringSpringBeanJobFactory();
		jobFactory.setApplicationContext(applicationContext);
		schedulerFactoryBean.setJobFactory(jobFactory);

		schedulerFactoryBean.setApplicationContext(applicationContext);

		Properties properties = new Properties();
		properties.putAll(quartzProperties.getProperties());

		schedulerFactoryBean.setGlobalTriggerListeners(triggersListener);
		schedulerFactoryBean.setGlobalJobListeners(jobsListener);
		schedulerFactoryBean.setOverwriteExistingJobs(true);
		schedulerFactoryBean.setDataSource(dataSource);
		schedulerFactoryBean.setQuartzProperties(properties);
		schedulerFactoryBean.setWaitForJobsToCompleteOnShutdown(true);
		return schedulerFactoryBean;
	}
}
