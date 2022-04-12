package com.example.mathmicroapp;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MathService {
  private Random random = new Random();
  private int max = 10;

  public Question getRandomQuestion() {
    int a = random.nextInt(max);
    int b = random.nextInt(max);

    return Question.builder()
        .question(a + " + " + b + " = ?")
        .answer(a + b + "")
        .build();
  }
}
