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
@Client(id="simple3")   // incorrect endpoint - just '/' is used as context path
//@Client("simple3")    // incorrect endpoint - 'simple3' is used as context path instead of service url+path
// no completion/navigation for id  https://youtrack.jetbrains.com/issue/IDEA-239670
public interface Simple3Client {
    
    @Get("/test0")
    Single<String> test0();
}
