package com.example.mathmicroapp;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
public interface MathController {

  @GetMapping("/questions")
  List<Question> getRandomQuestion(@RequestParam int amount);
}