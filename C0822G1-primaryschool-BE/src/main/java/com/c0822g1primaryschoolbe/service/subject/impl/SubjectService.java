package com.c0822g1primaryschoolbe.service.subject.impl;

import com.c0822g1primaryschoolbe.entity.time_table_subject.Subject;
import com.c0822g1primaryschoolbe.repository.ISubjectRepository;
import com.c0822g1primaryschoolbe.service.subject.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService implements ISubjectService {
    @Autowired
    private ISubjectRepository subjectRepository;

    @Override
    public List<Subject> findAllSubject() {
        return subjectRepository.findAllSubject();
    }
}
