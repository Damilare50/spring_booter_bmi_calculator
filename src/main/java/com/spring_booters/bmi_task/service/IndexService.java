package com.spring_booters.bmi_task.service;

import com.spring_booters.bmi_task.pojo.Bmi;
import com.spring_booters.bmi_task.pojo.BmiResponseDto;
import com.spring_booters.bmi_task.pojo.CalculateBmiDto;
import com.spring_booters.bmi_task.pojo.Person;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class IndexService {

  private final Map<String, Bmi> bmiContext;

  public IndexService(Map<String, Bmi> bmiContext) {
    this.bmiContext = bmiContext;
  }

  public BmiResponseDto calculateBmi(CalculateBmiDto data) {
    Bmi bmi = bmiContext.get(data.getUnit().toString());

    Person person = new Person();
    person.setName(data.getName());
    person.setAge(data.getAge());
    person.setWeight(data.getWeight());
    person.setHeight(data.getHeight());

    double value = bmi.calculate(person.getWeight(), person.getHeight());

    BmiResponseDto responseDto = new BmiResponseDto();
    responseDto.setValue(value);
    responseDto.setCategory(bmi.getCategory(value));
    responseDto.setName(person.getName());

    return responseDto;
  }
}
