package com.helpezee.service;

import javax.jws.WebService;

@WebService(targetNamespace = "http://ws.helpezee.wordpress.com/service/CXFSOAP")
public interface HelloWorldService {
 
 public void sayHello();
}