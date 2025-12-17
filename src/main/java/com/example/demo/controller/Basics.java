package com.example.demo.controller;
import org.springgramework.web.bind.annotation.*;
@RestController
public class basics{
    @GetMapping("/home")
    public String name(){
        return "hello world";
    }
}