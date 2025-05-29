package com.spring_booters.bmi_task.pojo;

import org.springframework.stereotype.Component;

@Component("imperial")
public class ImperialBmi extends Bmi {
  @Override
  public double calculate(double height, double weight) {
    return (weight / Math.pow(height, 2)) * 703;
  }
}
