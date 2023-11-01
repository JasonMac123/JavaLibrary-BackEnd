package com.Jason.MovieLibrary;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
  @GetMapping
  public ResponseEntity<String> Movies() {
    return new ResponseEntity<String>( "All movies!", HttpStatus.OK);
  }
}
