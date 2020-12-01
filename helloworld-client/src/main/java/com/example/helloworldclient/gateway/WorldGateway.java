package com.example.helloworldclient.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorldGateway {
  @Bean
  public RouteLocator worldService(RouteLocatorBuilder builder) {
    return builder.routes()
            .route("getWorld", r -> r.path("/world")
                    .uri("lb://WORLD-SERVICE"))
            .build();
  }
}
