package com.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("trace2")
public interface Trace2ServiceClient {
  @RequestMapping(value = "/trace2", method = RequestMethod.GET)
  String trace();
}
