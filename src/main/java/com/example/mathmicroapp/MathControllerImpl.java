package com.example.mathmicroapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathControllerImpl implements MathController {

  @Autowired
  private MathService mathService;

  @Override
  public List<Question> getRandomQuestion(int amount) {
    List<Question> questions = new ArrayList<>();
    for (int i = 0; i < amount; i++) {
      questions.add(mathService.getRandomQuestion());
    }
    return questions;
  }
}
