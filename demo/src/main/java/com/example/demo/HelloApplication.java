
package com.example.demo;

import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApplication{
 Scanner scan = new Scanner(System.in); 
    @RequestMapping("/hello")
    public String hello(){
         return "Hello World";
    }
    // @RequestMapping("/calculator")
    // public String calculator(){
    //     String a = "1";
    //     int b = 2;
    //     return a + b ;
    // }

}