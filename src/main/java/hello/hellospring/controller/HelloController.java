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
		input.put("reqCd", "D");
		input.put("reqCd", "Q");
		// 동해물과 백두산이 마르고 달도록
		// 마에다상 왜이러시오
		return "hello";
	}

}
