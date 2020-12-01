package com.example.worldservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class WorldController {

  @Value("${message}")
  private String message;

  @RefreshScope
  @GetMapping("/world")
  public ResponseEntity<Object> getWorld() {
    return ResponseEntity.ok().body("World" + message);
  }
}
