package com.mytests.micronaut.testWeb.test1.server;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * *******************************
 * <p>Created by irina on 12.08.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * *******************************
 */
@Controller("/")
public class GreetingController {

    @Get("/greet/{name}")
    String greet(String name) {
        return "hello " + name;
    }
}
