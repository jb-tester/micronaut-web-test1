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
@Client(id="simple5", path = "/simple/c5")   // incorrect endpoint here
public interface Simple5Client {
    
    @Get("/test0")
    Single<String> test0();
}
