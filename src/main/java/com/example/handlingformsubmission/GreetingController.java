package com.example.handlingformsubmission;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting()); //O que está "greeting" é o que vai buscar ao html(${greeting}).O new Gretting é o valor concreto.
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model,HttpServletRequest request) {
        model.addAttribute("greeting", greeting);
        String op = request.getParameter("op"); // Retorna o value de um parâmetro solicitado como String ou null se o parâmetro não existir.
        
        int num1 = Integer.parseInt(request.getParameter("Pnumero"));
        int num2 = Integer.parseInt(request.getParameter("Snumero"));
        System.out.println(num1);
        greeting.doGet(num1, num2, op);
        model.addAttribute("result",greeting.getTot());
        return "result";
    }
}
