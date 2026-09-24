package com.example.taskmanager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
        "spring.datasource.url=${DB_URL:jdbc:mysql://localhost:3306/taskmanager_db}",
        "spring.datasource.username=${DB_USERNAME:root}",
        "spring.datasource.password=${DB_PASSWORD}"
})
class TaskmanagerApplicationTests {

    @Test
    void contextLoads() {
    }

}