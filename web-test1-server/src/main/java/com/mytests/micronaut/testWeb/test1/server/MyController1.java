package com.mytests.micronaut.testWeb.test1.server;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

/**
 * *******************************
 * <p>Created by irina on 13.04.2020.</p>
 * <p>Project: micronaut-web-test1   </p>
 * <p>Test path variables: </p>
 * <ul>
 *  <li>annotated with explicit attribute,</li> 
 *  <li>annotated without attributes   </li>
 *  <li> not annotated</li>
 </ul>
 * *******************************
 */
@Controller("/test1")
public class MyController1 {
    
    @Get("/")
    public String home(){
        return "home";
    }

    @Get("/with_var_noanno/{myvar1}/{myvar2}")
    public String with_var_noanno(String myvar1, String myvar2) {
        return "with_vars "+myvar1+" "+myvar2;
    }

    @Get("/with_var_annotated/{myvar11}/{myvar12}")
    public String with_var_annotated(@PathVariable("myvar11") String var1, @PathVariable("myvar12")String var2) {
        return "with_vars "+var1+" "+var2;
    }

    @Get("/with_var_annotated_imp/{myvar21}/{myvar22}")
    public String with_var_annotated_imp(@PathVariable String myvar21, @PathVariable String myvar22) {
        return "with_vars "+myvar21+" "+myvar22;
    }
}
