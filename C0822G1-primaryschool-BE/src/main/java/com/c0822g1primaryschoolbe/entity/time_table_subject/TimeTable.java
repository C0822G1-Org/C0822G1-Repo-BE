package com.c0822g1primaryschoolbe.entity.time_table_subject;

import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long timeTableId;
    private Integer lesson;
    @OneToMany(mappedBy = "timeTable")
    @JsonBackReference
    private Set<TimeTableSubject> timeTableSubjectSet;
    @OneToOne(mappedBy = "timeTable")
    private Clazz clazz;

    public Long getTimeTableId() {
        return timeTableId;
    }

    public void setTimeTableId(Long timeTableId) {
        this.timeTableId = timeTableId;
    }

    public Integer getLesson() {
        return lesson;
    }

    public void setLesson(Integer lesson) {
        this.lesson = lesson;
    }

    public Set<TimeTableSubject> getTimeTableSubjectSet() {
        return timeTableSubjectSet;
    }

    public void setTimeTableSubjectSet(Set<TimeTableSubject> timeTableSubjectSet) {
        this.timeTableSubjectSet = timeTableSubjectSet;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }
}
