package com.Jason.MovieLibrary;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class ReviewController {
  @Autowired
  private ReviewService reviewService;

  @PostMapping
  public ResponseEntity<Review> createReview(@RequestBody Map<String, String> data) {
    return new ResponseEntity<Review>(reviewService.createReview(data.get("reviewBody"), data.get("imdbId")), HttpStatus.OK);
  }
}
