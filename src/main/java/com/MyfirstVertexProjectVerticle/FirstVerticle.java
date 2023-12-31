package com.MyfirstVertexProjectVerticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class FirstVerticle extends AbstractVerticle {
    @Override
    public void start(Future<Void> startFuture) throws Exception {
        vertx.createHttpServer()
                .requestHandler(req -> req.response().end("Hello, World! "+add(3,5)+combine(" hey",", Man")))
                .listen(8080);
    }
    public int add(int numberA, int numberB){
        return numberA + numberB;
    }

    public String combine(String me, String you){
        return me+you;
    }

}
