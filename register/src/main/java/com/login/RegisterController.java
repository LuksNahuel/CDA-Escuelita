package com.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    DummyService ds;
	
	@GetMapping("/")
    public String loginUser(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }
	
	 @PostMapping("/")
	    public String readUser(@ModelAttribute User user) {
	       if(ds.existeUsuario(user)) {
	    	   if(ds.loginUsuario(user)) {
	    		   return "result";
	    	   }
	    	   return "wrong";
	       } 
	       else {
	    	   return "error";
	       }
	    	
	    }
	 
	
	@PostMapping("/register")
    public String register(@ModelAttribute User user) {
       ds.registroUsuario(user);
       return "login";
    }

   
}
