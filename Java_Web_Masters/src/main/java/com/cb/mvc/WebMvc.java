package com.cb.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebMvc {
	@RequestMapping("/helloWebMvc")
	public ModelAndView helloWebMvc(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("welcomePage", "welcomeMessage", "Hii Aniket");

	}

}
