package com.mytests.micronaut.testWeb.test1.client;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

/**
 * *******************************
 * <p>Created by irina on 28.04.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * *******************************
 */

@Client(value = "http://localhost:8081/simple/c4")
public interface Simple4Client {
    
    @Get("/test0")   // correct endpoint is used, but probably no live template should be used for the host:port part while generating request in http client
    Single<String> test0();
}
