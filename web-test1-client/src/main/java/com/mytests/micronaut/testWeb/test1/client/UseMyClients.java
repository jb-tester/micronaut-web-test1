package com.mytests.micronaut.testWeb.test1.client;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

/**
 * *******************************
 * <p>Created by irina on 28.04.2020.</p>
 * <p>Project: micronaut-web-test1</p>
 * *******************************
 */
@Controller
public class UseMyClients {

    @Inject
    Simple3Client simple3Client;
    @Inject
    Simple4Client simple4Client;
    @Inject
    Simple5Client simple5Client;
    @Inject
    Simple6Client simple6Client;
    @Inject
    GreetingClient greetingClient;

    @Get("/client/simple3")
    public String testSimple3Client() {
        return simple3Client.test0().blockingGet();
    }

    @Get("/client/simple4")
    public String testSimple4Client() {
        return simple4Client.test0().blockingGet();
    }

    @Get("/client/simple5")
    public String testSimple5Client() {
        return simple5Client.test0().blockingGet();
    }

    @Get("/client/simple6")
    public String testSimple6Client() {
        return simple6Client.test0().blockingGet();
    }

    @Get("/client/greet")
    public String testGreetingClient() {
        return greetingClient.greet("world").blockingGet();
    }
}
