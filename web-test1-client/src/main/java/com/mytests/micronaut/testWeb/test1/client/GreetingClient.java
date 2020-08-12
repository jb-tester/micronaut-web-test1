package com.mytests.micronaut.testWeb.test1.client;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

@Client("localhost:8081/") // should be treated as id though this id looks stupid
public interface GreetingClient {

    @Get("/greet/{name}")
    Single<String> greet(String name);
}