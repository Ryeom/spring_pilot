package com.ryeom.demo.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BoardController {
	@RequestMapping("/write")
	public String login(Model model) {
		
		return "board/write";
	}
}
