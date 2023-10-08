package com.MyfirstVertexProject;

import com.MyfirstVertexProjectVerticle.FirstVerticle;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class MainVerticle extends AbstractVerticle {
    public static void main(String[] args) {

        Vertx vertx = Vertx.factory.vertx();
        FirstVerticle fv = new FirstVerticle();
        vertx.deployVerticle(fv);

    }
}
