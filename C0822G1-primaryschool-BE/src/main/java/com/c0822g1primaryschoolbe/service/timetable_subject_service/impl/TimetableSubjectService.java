package com.c0822g1primaryschoolbe.service.timetable_subject_service.impl;

import com.c0822g1primaryschoolbe.repository.ITimetableSubjectRepository;
import com.c0822g1primaryschoolbe.service.timetable_subject_service.ITimetableSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimetableSubjectService implements ITimetableSubjectService {
    @Autowired
    private ITimetableSubjectRepository timetableSubjectRepository;

    @Override
    public void updateTimetableSubject(Long idSubject, Long idTimeSub) {
        timetableSubjectRepository.updateTimetableSubject(idSubject, idTimeSub);
    }
}
