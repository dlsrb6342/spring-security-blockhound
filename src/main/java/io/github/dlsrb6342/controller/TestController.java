package io.github.dlsrb6342.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class TestController {

    @GetMapping("/controller")
    public Mono<String> test() {
        return Mono.just("test");
    }
}
