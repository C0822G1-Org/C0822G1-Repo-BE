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
 * JUnit 5: Check url listBlog and function getAll()
 */

@SpringBootTest
@AutoConfigureMockMvc
public class BlogRestController_getAll {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAll() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/blog/abc"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void getAllBlog() throws Exception {

        this.mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/blog/?page=1"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("totalPages").value(2))
                .andExpect(jsonPath("totalElements").value(6))
                .andExpect(jsonPath("content[0].title").value("Trao Giải Khen Thưởng Học Kì I"))
                .andExpect(jsonPath("content[0].content").value("Sau nhiều tháng học hành vất vả, hôm nay là ngày các bạn sẽ gặt hái được những kết quả đầu tiên của 1 học kỳ"))
                .andExpect(jsonPath("content[0].start_date").value("2022-01-10"))
                .andExpect(jsonPath("content[0].poster").value("Thanh Hà"))
                .andExpect(jsonPath("content[0].img").value("https://phutho.gov.vn/sites/default/files/users/user231/image001_51.jpg"))
                .andExpect(jsonPath("content[2].title").value("Ngoại Khóa An Toàn Giao Thông"))
                .andExpect(jsonPath("content[2].content").value("Ngày khai giảng năm học mới là ngày khai giảng hay ngày khai trường đầu tiên của một năm học mới. Tại Việt Nam, theo truyền thống thì các trường thường tổ chức lễ khai giảng năm học mới vào ngày 5/9.\n" +
                        "\n" +
                        "Danh từ \"khai giảng\" là một cụm từ Hán Việt. Trong đó, từ \"khai\" có nghĩa là mở ra hay bắt đầu một thứ gì đó, từ \"giảng\" có nghĩa là giảng giải hay diễn giảng. Cụm từ \"khai giảng\" có nghĩa là bắt đầu giảng dạy. Hiểu một cách đơn giản hơn thì ngày khai giảng là ngày bắt đầu giảng dạy cho một năm học hay khóa học mới. Ngày khai giảng chính là ngày đầu tiên của năm học hay khóa học đó.\n" +
                        "\n" +
                        "Ngày đầu tiên của năm học mới trong tiếng Anh thường được gọi là \"first day of school\" hoặc \"the start of a new school year\", \"the beginning of a new school year\". Hoặc đơn giản hơn, trong văn nói (speaking) thì ngày quay trở lại trường học được gọi là \"back to school\". Trong đó, lễ khai giảng hay ngày khai giảng trong tiếng Anh thường được gọi là \"the first day of school ceremony\" hoặc \"the opening ceremony of the new academic/school year\"."))
                .andExpect(jsonPath("content[2].start_date").value("2022-02-11"))
                .andExpect(jsonPath("content[2].poster").value("Minh Trí"))
                .andExpect(jsonPath("content[2].img").value("https://phutho.gov.vn/sites/default/files/users/user231/image001_51.jpg"));
    }

}