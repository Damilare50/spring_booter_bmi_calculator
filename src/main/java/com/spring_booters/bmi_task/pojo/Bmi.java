package com.spring_booters.bmi_task.pojo;

public abstract class Bmi {
  enum Category {
    Underweight,
    Normal,
    Overweight,
    Obese,
    Invalid
  }

  public abstract double calculate(double weight, double height);

  public String getCategory(double bmi) {
    if (bmi < 18.5) {
      return Category.Underweight.toString();
    } else if (bmi >= 18.5 && bmi <= 24.9) {
      return Category.Normal.toString();
    } else if (bmi > 24.9 && bmi <= 29.9) {
      return Category.Overweight.toString();
    } else if (bmi > 29.9) {
      return Category.Obese.toString();
    }

    return Category.Invalid.toString();
  }
}
