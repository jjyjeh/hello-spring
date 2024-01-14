package hello.hellospring.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {
	
	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data", "hello!!");
		HashMap<Object, String> input = new HashMap<Object, String>();
		input.put("dtlYn", "Y");
		input.put("reqCd", "R");
		input.put("reqCd", "N");
		
		
		return "hello";
	}

}
