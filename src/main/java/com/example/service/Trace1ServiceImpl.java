package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Trace1ServiceImpl implements Trace1Service {
  private final static Logger log = LoggerFactory.getLogger(Trace1ServiceImpl.class);

  @Autowired
  private Trace2ServiceClient trace2ServiceClient;

  @Override
  public void trace1Service(){
    log.info("Call trace1Service");
    trace2ServiceClient.trace();
  }
}
