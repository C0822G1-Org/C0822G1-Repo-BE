package com.c0822g1primaryschoolbe.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ClassRestController_showListClassStudentById {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void showListClassStudentById_id_5() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders.get("/api/class/{id}", "null"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void getCustomerById_idCustomer_6() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders.get("/api/class/{id}", "1"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("clazzId").value(1))
                .andExpect(jsonPath("clazzName").value("1A1"))
                .andExpect(jsonPath("flagDelete").value("false"))
                .andExpect(jsonPath("year").value(1))
                .andExpect(jsonPath("schoolYear").value("1"))
                .andExpect(jsonPath("timeTable").value(null))
                .andExpect(jsonPath("schoolYear").value("1"))
                .andExpect(jsonPath("teacherId").value(1))
                .andExpect(jsonPath("blockId").value(1));
    }
}
