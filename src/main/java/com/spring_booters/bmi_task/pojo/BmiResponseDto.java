package com.spring_booters.bmi_task.pojo;

public class BmiResponseDto {
  private double value;
  private String category;
  private String name;

  public double getValue() {
    return this.value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
