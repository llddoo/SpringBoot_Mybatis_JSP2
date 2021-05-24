package com.iu.s1.member;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iu.s1.member.MemberVO;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	@GetMapping("join")
	public void join(Model model) throws Exception {
						//내용은 없는 빈 객체를 하나 보내줌
		model.addAttribute("memberVO", new MemberVO());
		
	}
	@PostMapping("join")
	public String join(@Valid MemberVO memberVO, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "member/join";
		}
		return "redirect:/";
	}

}
