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
@Controller("/test0/{myvar0}{myvar00}")
public class MyController0 {

    public static final String MYVAR_0 = "myvar0";
    public static final String MY_VAR_02 = "my-var02";

    @Get
    public String home(@PathVariable(MYVAR_0) String var0, String myvar00) {
        return "test0 " + myvar00 + var0;
    }

    @Get("/2/{my-var02}")      // TODO: check later that annotation value removing causes error reporting
    public String home2(String myvar0,
                        @PathVariable(MY_VAR_02) String myVar02,
                        @PathVariable String myvar00) {
        return "test0 ";
    }
}
