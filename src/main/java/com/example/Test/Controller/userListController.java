package com.example.Test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userListController {

	@GetMapping("/userList")
	public String userList() {
		return "userList";
	}
}
