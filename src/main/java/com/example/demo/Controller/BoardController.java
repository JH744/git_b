package com.example.demo.Controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

	
	@GetMapping("/listBoard")
	public String listBoard() {
		return "게시물 목록";
	}
	
}
