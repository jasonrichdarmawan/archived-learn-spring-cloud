package com.example.worldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {

  @GetMapping("/world")
  public ResponseEntity<Object> getWorld() {
    return ResponseEntity.ok().body("World");
  }
}
