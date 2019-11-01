package com.curso.escuela.appdos.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/hora")
    public String hora(@RequestParam(name="hora", required=false, defaultValue="nosexd") String hora, Model model) {
    	/*LocalDateTime locaDate = LocalDateTime.now();
    	
    	int hours  = locaDate.getHour();
    	int minutes = locaDate.getMinute();
    	int seconds = locaDate.getSecond();
    	
    	String horaActual = "La hora es " + hours + " " + minutes + " " + seconds;*/
    	
    	model.addAttribute("jeje", hora);
        
    	return "hora";
    }

}
