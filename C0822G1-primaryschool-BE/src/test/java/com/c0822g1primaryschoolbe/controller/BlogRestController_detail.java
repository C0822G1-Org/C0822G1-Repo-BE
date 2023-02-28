package com.c0822g1primaryschoolbe.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

/**
 * Created by: LinhPT,
 * Date created: 28/02/2023,
 * JUnit 5: Check url detail and function detail()
 */




@SpringBootTest
@AutoConfigureMockMvc
public class BlogRestController_detail {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getDetailBlog_id_1() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/blog/detail/{id}", "null"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void getDetailBlog_id_3() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/blog/detail/3" ))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpectAll(jsonPath("id").value(3),
                        jsonPath("title").value("Tọa Đàm Mừng Ngày Nhà Giáo Việt Nam 20-11"),
                        jsonPath("img").value("https://phutho.gov.vn/sites/default/files/users/user231/image001_51.jpg"),
                        jsonPath("content").value("Hôm nay là kỉ niệm ngày nhà giáo Việt Nam, hòa chung không khí đó thầy và trò tổ chức buổi tọa đàm nhằm giao lưu văn nghệ"),
                        jsonPath("poster").value("Thanh Hà"),
                        jsonPath("start_date").value("2021-11-20"));
    }
}
