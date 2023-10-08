package com.MyfirstVertexProjectVerticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class FirstVerticle extends AbstractVerticle {
    @Override
    public void start(Future<Void> startFuture) throws Exception {
        vertx.createHttpServer()
                .requestHandler(req -> req.response().end("Hello, World!"))
                .listen(8080);
    }
}
