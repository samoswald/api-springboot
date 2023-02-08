package com.example.restapi;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/users")
public class UserController {

    @GetMapping // ( query parameter )
    public String getUser(@RequestParam(value = "page") int pageno, @RequestParam(value="limit") int limitno){
        return "Hello i got you and your pageno: " + pageno + "your limit is upto: "+limitno;

    }



    @GetMapping(path="/{username}") // path parameter
    public String getName(@PathVariable String username){
        return "Hey there iam: " + username;
    }

    @DeleteMapping // type of request
    public String deleteUser(){
        return "yeah i will delete you";
    }
}
