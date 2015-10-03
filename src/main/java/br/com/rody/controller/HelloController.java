package br.com.rody.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String exibirBemVindo(ModelMap model) {
		
		model.addAttribute("message", "Ola Rodney!!!");
		return "hello";
	}
	
	@RequestMapping(value="/hello/{nome:.+}", method=RequestMethod.GET)
	public ModelAndView hello(@PathVariable("nome") String nome){
		
		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", nome);
		
		return model;
	}

}
