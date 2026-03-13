package com.nothing.api.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jeevan")
public class HomeController
{
    @GetMapping("/home")
    public String helloWorld()
    {
        return "Welcome Back Boss...";
    }

    @GetMapping("/get")
    public Source helloWorldBean()
    {
        return new Source("Hello-World");
    }

    @GetMapping("/path/{name}")
    public Source setPathVariable(@PathVariable String name){

        return new Source(String.format("Hello Welcome Back, %s",name));
    }

}
