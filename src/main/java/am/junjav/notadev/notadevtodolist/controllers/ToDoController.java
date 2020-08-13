package am.junjav.notadev.notadevtodolist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToDoController {

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/")
    public String todoPage() {
        return "todo";
    }
}
