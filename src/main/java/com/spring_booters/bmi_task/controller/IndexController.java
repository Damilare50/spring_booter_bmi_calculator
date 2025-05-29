package com.spring_booters.bmi_task.controller;

import com.spring_booters.bmi_task.pojo.BmiResponseDto;
import com.spring_booters.bmi_task.pojo.CalculateBmiDto;
import com.spring_booters.bmi_task.service.IndexService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class IndexController {
  private final IndexService indexService;

  @Autowired
  public IndexController(IndexService indexService) {
    this.indexService = indexService;
  }

  @GetMapping("")
  public ResponseEntity<String> index() {
    return ResponseEntity.status(HttpStatus.OK).body("Hello World!");
  }

  @PostMapping("/bmi/calculate")
  public ResponseEntity<BmiResponseDto> calculate(@Valid @RequestBody CalculateBmiDto data) {
    System.out.println(data.toString());
    BmiResponseDto response = this.indexService.calculateBmi(data);

    return ResponseEntity.status(HttpStatus.OK).body(response);
  }
}
