package io.github.dlsrb6342.routerfunction;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class TestHandler {

    public Mono<ServerResponse> test(ServerRequest request) {
        return ServerResponse.ok().bodyValue("test");
    }

}
