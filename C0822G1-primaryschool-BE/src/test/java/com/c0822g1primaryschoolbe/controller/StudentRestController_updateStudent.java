package com.c0822g1primaryschoolbe.controller;

import com.c0822g1primaryschoolbe.dto.StudentDto;
import com.c0822g1primaryschoolbe.entity.clazz.Clazz;
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
public class StudentRestController_updateStudent {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void updateStudent_img_20() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_studentName_20() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("abc");
        studentDto.setStudentName("");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_dateOfBirth_20() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("abc");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_gender_20() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_fatherName_20() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_phoneNumberFather_20() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_fatherJob_20() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_motherName_20() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_motherJob_20() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_phoneNumberMother_20() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_religion_20() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }


    @Test
    public void updateStudent_address_20() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_24() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("abc.jpg");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_img_19() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg(null);
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_studentName_19() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("abc.jpg");
        studentDto.setStudentName(null);
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_dateOfBirth_19() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("abc.jpg");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth(null);
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_gender_19() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("abc.jpg");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(null);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_fatherName_19() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("abc.jpg");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName(null);
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_phoneNumberFather_19() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("abc.jpg");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather(null);
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_fatherJob_19() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("abc.jpg");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob(null);
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_motherName_19() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("abc.jpg");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName(null);
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_phoneNumberMother_19() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("abc.jpg");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother(null);
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_motherJob_19() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("abc.jpg");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob(null);
        studentDto.setReligion("Khong");
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_religion_19() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("abc.jpg");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion(null);
        studentDto.setAddress("Hai Chau, Da Nang");

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void updateStudent_address_19() throws Exception {

        StudentDto studentDto = new StudentDto();
        studentDto.setImg("abc.jpg");
        studentDto.setStudentName("Mau Hoang");
        studentDto.setDateOfBirth("2000-10-05");
        studentDto.setGender(true);
        studentDto.setFatherName("Mau Hieu");
        studentDto.setPhoneNumberFather("+843456789");
        studentDto.setFatherJob("Doanh Nhan");
        studentDto.setMotherName("Phan Thi");
        studentDto.setPhoneNumberMother("+843456788");
        studentDto.setMotherJob("Doanh Nhan");
        studentDto.setReligion("Khong");
        studentDto.setAddress(null);

        Clazz clazz= new Clazz();
        clazz.setClazzId(1L);
        studentDto.setClazz(clazz);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/update-student/{student-id}")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
}
