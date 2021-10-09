package com.TestAPI.TimeSpent.resources;

import org.apache.tomcat.jni.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

@RestController
@RequestMapping("/")
public class MainResource {
    private LocalDateTime startTime = LocalDateTime.now();

    @GetMapping("")
    public long getTimeSpent(){
        LocalDateTime currTime = LocalDateTime.now();
        Duration diff = Duration.between(startTime, currTime);

        return diff.getSeconds();
    }


}
