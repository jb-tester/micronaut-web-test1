package com.mytests.micronaut.testWeb.test1.server;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

/**
 * *
 * <p>Created by irina on 22.10.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * *
 */
@Controller(value = "/test4/{topvar1}-{topvar2}")
public class MyController4 {

    @Get("/m1")
    public String m1(@PathVariable("topvar1") String topvar1,
                     @PathVariable("topvar2") String topvar2) {
        return "m1" + topvar1 + topvar2;
    }

    @Get("/m2")
    public String m2(@PathVariable String topvar1,
                     @PathVariable String topvar2) {
        return "m2" + topvar1 + topvar2;
    }

    @Get("/m3/{pv3}")
    public String m3(String topvar1,
                     String topvar2,
                     String pv3) {
        return "m3" + topvar1 + topvar2 + pv3;
    }
}
