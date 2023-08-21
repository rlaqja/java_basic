package com.kim.Quartz.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kim.Quartz.model.JobHistory;

@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistory, Long>{
	Page<JobHistory> findAll(Pageable pageable);
	Optional<List<JobHistory>> findJobHistoryByJobNameAndJobGroup(String jobName,String jobGroup);
	Optional<JobHistory> findFirestByJobNameAndJobGroupOrderByHistoryIdDesc(String jobName,String jobGroup);
	Optional<JobHistory> findFirstByJobNameAndJobGroupOrderByHistoryIdDesc(String testJobName, String testGroupName);
}
