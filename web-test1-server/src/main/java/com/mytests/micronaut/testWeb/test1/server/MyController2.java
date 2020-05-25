package com.mytests.micronaut.testWeb.test1.server;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

/**
 * *******************************
 * <p>Created by irina on 13.04.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * <p>test multiple urls</p>
 * *******************************
 */
@Controller("/test2")
public class MyController2 {

    @Get(uris = {"/alt1/{myvar3}", "/alt2/{myvar3}"})
    public String multiuri(@PathVariable(name="myvar3") String myvar) {
        return "multiple uris for " + myvar;
    }
}
