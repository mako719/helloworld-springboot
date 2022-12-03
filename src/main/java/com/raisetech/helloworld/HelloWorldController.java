package com.raisetech.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.ZoneId;


@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/tokyo")
    public static String time() {
        ZoneId zone = ZoneId.of("Asia/Tokyo");
        LocalTime now = LocalTime.now(zone);
        return "東京の時刻： %s".formatted(now);
    }
}
