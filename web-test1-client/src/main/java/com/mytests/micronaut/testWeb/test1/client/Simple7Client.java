package com.mytests.micronaut.testWeb.test1.client;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

/**
 * *******************************
 * <p>Created by irina on 11.08.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * *******************************
 */
@Client("http://localhost:8081/simple/s7")
public interface Simple7Client {
    // just to test completion for urls here that should respect the METHOD
    @Get("/test07")
    Single<String> test0get();

    @Post("/test07")
    Single<String> test0post();

    @Put("/test07")
    Single<String> test0put();
}
