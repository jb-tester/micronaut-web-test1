package com.mytests.micronaut.testWeb.test1.server;

import io.micronaut.context.ApplicationContext;
import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.uri.UriBuilder;
import io.micronaut.runtime.server.EmbeddedServer;

import static io.micronaut.http.HttpRequest.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


import io.micronaut.test.annotation.MicronautTest;
import io.reactivex.Flowable;
import org.junit.jupiter.api.Test;


import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import javax.inject.Inject;

import java.util.Collections;



/**
 * *******************************
 * <p>Created by irina on 28.04.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * *******************************
 */
@MicronautTest(packages = "com.mytests.micronaut.testWeb.test1.server", application = Application.class)
public class MyController0Test {
    
    @Inject
    EmbeddedServer server;

    @Inject
    @Client("/test0")
    HttpClient client;
    
    @Test
    public void homeTest() {
        String uri = UriBuilder.of("/{my_var}").expand(Collections.singletonMap("my_var", "foo")).toString();
        String resp = client.toBlocking().retrieve(uri);
        assertEquals(resp,"test0 foo");
    }

    @Test
    public void home2() {
        String uri = UriBuilder.of("{my_var}/2/{my_var2}").expand(Map.of("my_var","foo","my_var2","bar")).toString();
        String resp = client.toBlocking().retrieve(uri);
        assertEquals(resp,"test0 foobar");
    }
}