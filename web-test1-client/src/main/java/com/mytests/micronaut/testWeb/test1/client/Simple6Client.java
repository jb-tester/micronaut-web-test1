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
@Client("http://${simple6_host}/${simple6_base_path}")   
public interface Simple6Client {
    
    @Get("/test0")
    Single<String> test0();
}
