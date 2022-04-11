package com.MF.Detailing.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {
	
 @GetMapping("/run")	
  public String display() {
	  return "HTTPS accesed";
  }
  
}
