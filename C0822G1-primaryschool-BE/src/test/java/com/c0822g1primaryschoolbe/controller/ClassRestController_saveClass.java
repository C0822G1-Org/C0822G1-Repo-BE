package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.dto.ClazzDto;
import com.c0822g1primaryschoolbe.dto.TeacherDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ClassRestController_saveClass {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void saveClass_clazzName_13() throws Exception {

        ClazzDto clazzDto = new ClazzDto();
        clazzDto.setClazzName(null);
        clazzDto.setSchoolYear("2023");
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setTeacherId(1L);
        clazzDto.setTeacherDto(teacherDto);



        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/class/save")
                        .content(this.objectMapper.writeValueAsString(clazzDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is3xxRedirection());
    }
    @Test
    public void saveClass_schoolYear_13() throws Exception {

        ClazzDto clazzDto = new ClazzDto();
        clazzDto.setClazzName("1A1");
        clazzDto.setSchoolYear(null);
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setTeacherId(1L);
        clazzDto.setTeacherDto(teacherDto);



        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/class/save")
                        .content(this.objectMapper.writeValueAsString(clazzDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is3xxRedirection());
    }
    @Test
    public void saveClass_clazzName_14() throws Exception {

        ClazzDto clazzDto = new ClazzDto();
        clazzDto.setClazzName("");
        clazzDto.setSchoolYear("2023");
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setTeacherId(1L);
        clazzDto.setTeacherDto(teacherDto);



        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/class/save")
                        .content(this.objectMapper.writeValueAsString(clazzDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is3xxRedirection());
    }
    @Test
    public void saveClass_schoolYear_14() throws Exception {

        ClazzDto clazzDto = new ClazzDto();
        clazzDto.setClazzName("1A1");
        clazzDto.setSchoolYear("");
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setTeacherId(1L);
        clazzDto.setTeacherDto(teacherDto);



        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/class/save")
                        .content(this.objectMapper.writeValueAsString(clazzDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is3xxRedirection());
    }
    @Test
    public void saveClass_clazzName_15() throws Exception {

        ClazzDto clazzDto = new ClazzDto();
        clazzDto.setClazzName("!@$$!");
        clazzDto.setSchoolYear("2023");
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setTeacherId(1L);
        clazzDto.setTeacherDto(teacherDto);



        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/class/save")
                        .content(this.objectMapper.writeValueAsString(clazzDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void saveClass_schoolYear_15() throws Exception {

        ClazzDto clazzDto = new ClazzDto();
        clazzDto.setClazzName("1A1");
        clazzDto.setSchoolYear("ádasdasd");
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setTeacherId(1L);
        clazzDto.setTeacherDto(teacherDto);



        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/class/save")
                        .content(this.objectMapper.writeValueAsString(clazzDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void saveClass_clazzName_16() throws Exception {

        ClazzDto clazzDto = new ClazzDto();
        clazzDto.setClazzName("a");
        clazzDto.setSchoolYear("2023");
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setTeacherId(1L);
        clazzDto.setTeacherDto(teacherDto);



        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/class/save")
                        .content(this.objectMapper.writeValueAsString(clazzDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void saveClass_clazzName_17() throws Exception {

        ClazzDto clazzDto = new ClazzDto();
        clazzDto.setClazzName("aaaaaaaaaaaaaaaaaaa");
        clazzDto.setSchoolYear("2023");
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setTeacherId(1L);
        clazzDto.setTeacherDto(teacherDto);



        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/api/class/save")
                        .content(this.objectMapper.writeValueAsString(clazzDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void saveClass_18() throws Exception {

        ClazzDto clazzDto = new ClazzDto();
        clazzDto.setClazzName("1A1");
        clazzDto.setSchoolYear("2023");
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setTeacherId(1L);
        clazzDto.setTeacherDto(teacherDto);
        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/data-form/save")
                        .content(this.objectMapper.writeValueAsString(clazzDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }
}
