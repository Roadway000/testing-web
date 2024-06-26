package com.example.testing_web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SmokeTest {
    @Autowired
    private HomeController controller;
    @Test
    public void contextIsLoaded() throws Exception {
        assertThat(controller).isNotNull();
    }
}
