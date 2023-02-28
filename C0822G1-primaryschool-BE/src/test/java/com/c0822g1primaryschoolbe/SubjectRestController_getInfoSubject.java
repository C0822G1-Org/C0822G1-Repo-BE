package com.c0822g1primaryschoolbe;

import com.c0822g1primaryschoolbe.entity.time_table_subject.Subject;
import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTable;
import com.c0822g1primaryschoolbe.entity.time_table_subject.TimeTableSubject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SubjectRestController_getInfoSubject {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    @Test
    public void getInfoSubject_id_5() throws Exception {
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/listSubject/3"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void getInfoSubject_id_6() throws Exception {
        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/listSubject"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpectAll(jsonPath("$[0].subjectId").value(1),
                        jsonPath("$[0].subjectName").value("Văn"))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void updateTimetableSubject_name_14() throws Exception {
        List<TimeTableSubject> timeTableSubjectList = new ArrayList<>();
        TimeTableSubject timeTableSubject = new TimeTableSubject();

        Subject subject = new Subject();
        subject.setSubjectId(3L);
        subject.setSubjectId(1L);
        timeTableSubject.setSubject(subject);

        TimeTable timeTable = new TimeTable();
        timeTable.setTimeTableId(1L);
        timeTable.setTimeTableId(2L);
        timeTableSubject.setTimeTable(timeTable);

        timeTableSubject.setId(1L);
        timeTableSubject.setId(2L);
        timeTableSubjectList.add(timeTableSubject);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .patch("/updateTimetableSubject")
                        .content(this.objectMapper.writeValueAsString(timeTableSubjectList))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }
}
