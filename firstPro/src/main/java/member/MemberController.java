package member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	@RequestMapping(value = "/member/insert.do",method = RequestMethod.GET)
	public String showPage() {
		return "member/register";
	}
	
	@RequestMapping(value = "/member/insert.do",method = RequestMethod.POST)
	public String insert() {
		System.out.println("회원가입 비즈니스 메소드");
		return "redirect:/index.do";
	}
}
