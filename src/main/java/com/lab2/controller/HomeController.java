package com.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/** Comodidad: al entrar a la raiz del sitio, redirige directo al listado. */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "redirect:/empleos";
    }
}
