package com.spring_booters.bmi_task.pojo;

import jakarta.validation.constraints.*;

public class CalculateBmiDto {
  public enum Unit {
    metric,
    imperial
  }

  @NotNull
  @Positive(message = "Weight must be greater than 0")
  private double weight;

  @NotNull
  @Positive(message = "Height must be greater than 0")
  private double height;

  @NotNull(message = "Unit must be metric/imperial")
  private Unit unit;

  @NotNull(message = "name must be specified")
  private String name;

  @Min(value = 1, message = "age must be at least 1")
  private int age;

  public CalculateBmiDto(double weight, double height, Unit unit, String name, int age) {
    this.weight = weight;
    this.height = height;
    this.unit = unit;
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getHeight() {
    return this.height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public Unit getUnit() {
    return this.unit;
  }

  public void setUnit(String unit) {
    this.unit = Unit.valueOf(unit);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "CalculateBmiDto{" +
               "weight=" + weight +
               ", height=" + height +
               ", unit=" + unit +
               ", name='" + name + '\'' +
               ", age=" + age +
               '}';
  }
}
