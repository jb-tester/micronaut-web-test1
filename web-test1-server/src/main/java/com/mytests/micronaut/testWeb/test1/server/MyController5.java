package com.mytests.micronaut.testWeb.test1.server;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller(value = "/test5/{topvar1}-{topvar2}")
public class MyController5 {


    @Get("/m1")
    public String m1(@PathVariable String topvar1,
                     String topvar2) {
        return "m2" + topvar1 + topvar2;
    }

    @Get("/m2/{self_var}")
    public String m2(@PathVariable String self_var,
                     @PathVariable("topvar1") String topvar1,
                     String topvar2) {
        return "m2" + topvar1 + topvar2 + self_var;
    }

}