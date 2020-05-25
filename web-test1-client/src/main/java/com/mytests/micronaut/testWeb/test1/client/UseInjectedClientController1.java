package com.mytests.micronaut.testWeb.test1.client;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.uri.UriBuilder;
import io.reactivex.Maybe;

import javax.inject.Inject;

import java.util.Map;

import static io.micronaut.http.HttpRequest.GET;

/**
 * *******************************
 * <p>Created by irina on 28.04.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * *******************************
 */
@Controller
public class UseInjectedClientController1 {

    @Client("http://localhost:8081/simple/c1")    // no endpoints
    @Inject
    RxHttpClient httpClient;
    
    
    @Get("/client/simple1/test00")
    public Maybe<String> test00(){
        return httpClient.retrieve(GET("/test0")).firstElement();
    }       // url parts usages search doesn't consider the client
    
    @Get("/client/simple1/test01/{v0}")
    public Maybe<String> test01(@PathVariable String v0){
       return httpClient.retrieve(GET("/test1/"+v0)).firstElement(); 
    }
    
    @Get("/client/simple1/test02/{v0}/{v1}")
    public Maybe<String> test02(@PathVariable String v0, @PathVariable String v1){
        String uri = UriBuilder.of("/test2/{my_var}/{my_var2}").expand(Map.of("my_var",v0,"my_var2",v1)).toString();   // UriBuilder uri is not treated as uri at all
        return httpClient.retrieve(uri).firstElement();
    }
}
