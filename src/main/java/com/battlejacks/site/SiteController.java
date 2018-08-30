package com.battlejacks.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {
  @RequestMapping(value = "/")
  public String index() {
    return "index";
  }
}
