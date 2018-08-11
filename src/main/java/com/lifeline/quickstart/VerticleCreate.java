package com.lifeline.quickstart;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class VerticleCreate extends AbstractVerticle {

    @Override
    public void start(Future<Void> startFuture) {

        System.out.println("First Verticle started!");
        vertx.deployVerticle(new SecondVerticle());
    }

    @Override
    public void stop(Future stopFuture) throws Exception {
        System.out.println("MyVerticle stopped!");
    }
}
