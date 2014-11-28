package com.springapp.mvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
@RequestMapping("/")
public class HelloController {

	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		String now = (new Date()).toString();
		model.addAttribute("message", "Hello world!");
		model.addAttribute("now", now);

		logger.info("Returning hello view");
		return "hello";
	}
}