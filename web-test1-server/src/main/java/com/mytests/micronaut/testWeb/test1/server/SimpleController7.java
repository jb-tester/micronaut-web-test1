package com.mytests.micronaut.testWeb.test1.server;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;

/**
 * *******************************
 * <p>Created by irina on 11.08.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * *******************************
 */
@Controller("/simple/s7")
public class SimpleController7 {

    @Get("/test07")
    public String test0get() {
        return "simple c7 test0";
    }

    @Post("/test07")
    public void test0post() {
        System.out.println("s7 test0!");
    }

    @Put("/test07")
    public void test0put() {
        System.out.println("s7 test0 put!");
    }

    @Get("/test077")
    public String test077get() {
        return "simple c77 test0";
    }
}
