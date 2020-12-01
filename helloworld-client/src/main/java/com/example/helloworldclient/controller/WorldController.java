package com.example.helloworldclient.controller;

import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JCircuitBreakerFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorldController {
  @Bean
  public RouteLocator worldService(RouteLocatorBuilder builder) {
    return builder.routes()
            .route("getWorld", r -> r.path("/world")
                    .uri("lb://WORLD-SERVICE"))
            .build();
  }
}
