package com.c0822g1primaryschoolbe.entity.time_table_subject;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long subjectId;
    @Column(columnDefinition = "varchar(45)")
    private String subjectName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private List<TimeTable> timeTables;

    @OneToMany(mappedBy = "subject")
    @JsonBackReference
    private Set<TimeTableSubject> timeTableSubjectSet;

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public List<TimeTable> getTimeTables() {
        return timeTables;
    }

    public void setTimeTables(List<TimeTable> timeTables) {
        this.timeTables = timeTables;
    }

    public Set<TimeTableSubject> getTimeTableSubjectSet() {
        return timeTableSubjectSet;
    }

    public void setTimeTableSubjectSet(Set<TimeTableSubject> timeTableSubjectSet) {
        this.timeTableSubjectSet = timeTableSubjectSet;
    }
}