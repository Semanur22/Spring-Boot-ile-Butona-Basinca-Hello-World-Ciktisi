package com.example.HiWorld.HiController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HiController {
	@PostMapping("/greeting")
	public String Hi() {
		return "greeting";
	}
}
