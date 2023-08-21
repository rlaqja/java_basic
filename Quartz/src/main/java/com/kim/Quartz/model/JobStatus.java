package com.kim.Quartz.model;

import javax.persistence.*;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.kim.Quartz.model.audit.DateAudit;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "job_status")
public class JobStatus extends DateAudit {
    @Id
    @Column(name = "status_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statusId;

    @NotNull
    @Column(name = "job_state")
    @Enumerated(value = EnumType.STRING)
    private StateType jobState;

    @ManyToOne(optional = false)
    @JoinColumn(name = "history_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private JobHistory jobHistory;
}
