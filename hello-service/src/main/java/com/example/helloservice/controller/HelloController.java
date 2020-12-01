package com.example.helloservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloController {

  @Value("${message}")
  private String message;

  @GetMapping("/hello")
  public ResponseEntity<Object> getHello() {
    return ResponseEntity.ok().body("Hello" + message);
  }
}
