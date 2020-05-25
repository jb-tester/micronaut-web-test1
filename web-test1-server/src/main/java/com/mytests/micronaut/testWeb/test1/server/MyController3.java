package com.mytests.micronaut.testWeb.test1.server;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.PathVariable;

/**
 * *******************************
 * <p>Created by irina on 13.04.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * <p> controller injected in route builder </p>
 * @see MyRouter 
 */
@Controller()
public class MyController3 {
    
    public String testWithMyVar4(@PathVariable("myvar4") String myvar4) {
        return "mycontroller3 router "+ myvar4;
    }
    
}
