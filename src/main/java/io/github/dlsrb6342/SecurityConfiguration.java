package io.github.dlsrb6342;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.context.NoOpServerSecurityContextRepository;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityWebFilterChain springWebFilterChain(ServerHttpSecurity http) {
        return http.cors().disable()
                   .csrf().disable()
                   .logout().disable()
                   .httpBasic().and()
                   .requestCache().disable()
                   .securityContextRepository(NoOpServerSecurityContextRepository.getInstance())
                   .authorizeExchange()
                   .pathMatchers("/test").hasRole("MANAGER")
                   .anyExchange().permitAll().and()
                   .build();
    }

}
