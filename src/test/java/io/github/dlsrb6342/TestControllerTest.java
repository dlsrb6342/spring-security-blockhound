package io.github.dlsrb6342;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@AutoConfigureWebTestClient
class TestControllerTest {

    @Autowired
    WebTestClient testClient;

    @Test
    void test() {
        testClient.get().uri("/test")
                  .headers(httpHeaders -> httpHeaders.setBasicAuth("test_user", "test_pass", StandardCharsets.UTF_8))
                  .exchange()
                  .expectStatus().isOk();
    }

}