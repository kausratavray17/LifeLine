package com.lifeline.quickstart;

import io.vertx.core.Vertx;

public class VertxApp
{
    public static void main(String args[])
    {
        Vertx vertx = Vertx.vertx();
        System.out.println("Created Vertx instance !");
        vertx.deployVerticle(new VerticleCreate());
        vertx.close();
    }
}