package com.mytests.micronaut.testWeb.test1.server;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

/**
 * *******************************
 * <p>Created by irina on 13.04.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * <p>controller-level path variables</p>
 * <p> and also dashes in var names </p>
 * *******************************
 */
@Controller("/test0/{myvar0}")
public class MyController0 {

    @Get
    public String home(@PathVariable("myvar0") String var0) {
        return "test0 "+var0;
    }
    @Get("/2/{my-var02}")      // TODO: check later that annotation value removing causes error reporting
    public String home2(@PathVariable("myvar0") String var0, @PathVariable("my-var02") String myVar02) {
        return "test0 "+var0+myVar02;
    }
}
