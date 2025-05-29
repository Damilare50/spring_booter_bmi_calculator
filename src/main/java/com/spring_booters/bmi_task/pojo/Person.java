package com.spring_booters.bmi_task.pojo;

import org.springframework.stereotype.Component;

@Component
public class Person {
  private String name;
  private int age;
  private double weight;
  private double height;

  public Person() {
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
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
}
