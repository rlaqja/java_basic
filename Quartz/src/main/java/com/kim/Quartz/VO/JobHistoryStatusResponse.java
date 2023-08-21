package com.kim.Quartz.VO;

import java.util.Date;

import com.kim.Quartz.model.JobType;
import com.kim.Quartz.model.StateType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Deprecated
public class JobHistoryStatusResponse {
	private Long statusId;
	private StateType jobState;
	private Date createDt;
	
	private String jobName;
	private String jobGroup;
	private JobType jobType;
	
}
