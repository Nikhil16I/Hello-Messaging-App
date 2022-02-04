package com.restapi.hellomessaging_app.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")

public class RestApiController {
    /*UC-1*/
    @RequestMapping(value = { "", "/", "/home" })
    public String sayHello() {
        return "Hello from BridgeLabs...!";
    }
    /*UC-2*/
    /*using-http://localhost:8080/hello/query?name= Nikhil*/
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String Name){
        return "Hello"+Name+ " from BridgeLabs.";
    }
    /* UC-3 */
    /* Using-http://localhost:8080/hello/param/ Nikhil*/
    @RequestMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello"+name+ " from BridgeLabs.";
    }
}
