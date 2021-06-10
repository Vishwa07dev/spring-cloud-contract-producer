package com.upgrad.springcloud.producer;


import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IntegerIdentifier {


  @GetMapping("/validate/integer")
  public String isNumberInteger(@RequestParam("number") String number) {
    try {
      Integer.parseInt(number);
    }
    catch(NumberFormatException e){
        return "NO" ;
      }
     return "YES" ;
  }
}
