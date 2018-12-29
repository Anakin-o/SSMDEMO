package com.ssm.demo.controller;

import com.ssm.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private PersonService personService;
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String selectPerson(HttpServletRequest request, HttpServletResponse response) throws IOException {

      return  "index";
    }
}