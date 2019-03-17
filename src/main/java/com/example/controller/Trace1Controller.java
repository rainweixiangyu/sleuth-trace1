package com.example.controller;

import com.example.service.Trace1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trace1Controller {
  @Autowired
  private Trace1Service trace1Service;

  @RequestMapping(value = "/trace1", method = RequestMethod.GET)
  public void trace(){
    trace1Service.trace1Service();
  }
}
