package com.lifeline.quickstart;

import io.vertx.core.AbstractVerticle;

public class SecondVerticle extends AbstractVerticle {

    @Override
    public void start () throws Exception
    {
        System.out.println("Second verticle started");
    }
}
