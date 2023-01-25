package com.example.Test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Test.Service.TestService;
import com.example.Test.Vo.TestVo;

@Controller
public class userListController {

	private final TestService testService;
	
	@Autowired
	public userListController(TestService testService) {
		this.testService = testService;
	}
	
	@GetMapping("/userList")
	public String userList(Model model) {
		List<TestVo> testlist = testService.findMembers();
		model.addAttribute("userList",testlist);
		return "userList";
	}
}
