package com.bootcamp.demo_sb_helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@ResponseBody

public class HelloworldController {

  @GetMapping("/WLJ")
  public String helloworld() {
      return "Hello! Welcome to sea";
  }

  @GetMapping("/wlj")
  public String bootcamp() {
      return "who love java?";
  }
  
}
