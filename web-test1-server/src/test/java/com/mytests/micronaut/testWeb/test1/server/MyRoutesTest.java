package com.mytests.micronaut.testWeb.test1.server;

import com.mytests.micronaut.testWeb.test1.server.Application;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;


import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * *******************************
 * <p>Created by irina on 13.04.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * *******************************
 */
@MicronautTest(packages = "com.mytests.micronaut.testWeb.test1.server", application = Application.class)
public class MyRoutesTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    public void testRouter() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/test3/foo"));
        assertEquals("mycontroller3 router foo", response);
    }
}