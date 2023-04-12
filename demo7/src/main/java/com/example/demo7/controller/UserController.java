package com.example.demo7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // IoC 처리됨
public class UserController {

	// http://localhost:8080/
	// http://localhost:8080/user
	@GetMapping({ "/", "user" })
	public String userPage(Model model) {
		// yml 파일 설정
		// prefic : /WEB-INF/view/
		// subfix : .jsp

		// 결과적으로 /WEB-INF/view/user.jsp 가 완성됨
		// viewResolver가 동작해서 페이를 찾고 리턴

		// 데이터를 내려보내고 싶다면 매개변수에 Model선언후
		// addAttribute 해준다.
		model.addAttribute("principal", "헬로우~~~");
		return "user";
	}

}
