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
public class StudentRestController_createStudent {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void createStudent_img_14() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_studentName_14() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_dateOfBirth_14() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_gender_14() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_fatherName_14() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_phoneNumberFather_14() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_fatherJob_14() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_motherName_14() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_motherJob_14() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_phoneNumberMother_14() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_religion_14() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }


    @Test
    public void createStudent_address_14() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_18() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_img_13() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_studentName_13() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_dateOfBirth_13() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_gender_13() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_fatherName_13() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_phoneNumberFather_13() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_fatherJob_13() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_motherName_13() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_phoneNumberMother_13() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_motherJob_13() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_religion_13() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void createStudent_address_13() throws Exception {

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
                        .post("/create-student")
                        .content(this.objectMapper.writeValueAsString(studentDto))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
}
