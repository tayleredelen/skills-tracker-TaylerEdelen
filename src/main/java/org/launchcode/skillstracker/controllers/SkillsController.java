package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody


public class SkillsController {

    //test works :)
//        @GetMapping("test")
//        public String hello() {
//        return "Hello, World!";
//    }

    @GetMapping()
    public String intro() {
        return "<h1>" +
                "Skills Tracker" +
                "</h1>" +
                "<h2>" +
                "We have a few skills we would like to learn. Here is the list!" +
                "</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("form")
    public String languages() {
        return "<html>" +
                "<body>" +
                "<p>Name: </p>" +
//                "<form action = 'languages' method = 'post'>" +
                "<input type = 'text' name = 'name' />" +
                //name text box

                "<p>My favorite language:</p>" +
                "<select name = 'My favorite language:'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                //dropdown & options

                "<p>My second favorite language:</p>" +
                "<select name = 'My second favorite language:'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                //dropdown & options

                "<p>My third favorite language:</p>" +
                "<select name = 'My third favorite language:'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                //dropdown & options

                "<input type = 'submit' value = 'Submit' />" +
                //submit button
                "</form>" +
                "</body>" +
                "</html>";
    }


   @PostMapping("form")
    public String results() {
        return name;
    }

}

