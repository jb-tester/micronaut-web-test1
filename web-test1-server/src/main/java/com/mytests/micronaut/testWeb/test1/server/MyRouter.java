package com.mytests.micronaut.testWeb.test1.server;

import io.micronaut.context.ExecutionHandleLocator;
import io.micronaut.web.router.DefaultRouteBuilder;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * route builder that injects the controller method
 * @see MyController3
 */
@Singleton
public class MyRouter extends DefaultRouteBuilder { 

    public MyRouter(ExecutionHandleLocator executionHandleLocator, UriNamingStrategy uriNamingStrategy) {
        super(executionHandleLocator, uriNamingStrategy);
    }

    @Inject
    void controller3Routes(MyController3 controller3) {
        GET("/test3/{myvar4}",
                controller3,
                "testWithMyVar4",
                String.class); 
    }
}