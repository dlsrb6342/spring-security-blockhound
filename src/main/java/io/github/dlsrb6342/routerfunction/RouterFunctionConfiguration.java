package io.github.dlsrb6342.routerfunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

@Configuration
public class RouterFunctionConfiguration {

    @Bean
    RouterFunction<?> routes(TestHandler testHandler) {
        return RouterFunctions.route(GET("/routerfunction"), testHandler::test);
    }

}
