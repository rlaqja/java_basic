package com.kim.Quartz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kim.Quartz.model.JobStatus;

@Repository
public interface JobStatusRepository extends JpaRepository<JobStatus, Long>{

}
