package com.korea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.korea.k2.guestbook.GuestBookService;
import com.korea.k2.guestbook.GuestBookVO;

@Controller
public class GuestBookController {

	@Autowired
	private GuestBookService service;
	
	@RequestMapping("/guestBookInsert.do")
	String guestBookInsert( GuestBookVO vo ) {
		String [] str1 = {"박", "석", "김", "이", "최", "강", "배", "서", "양"};
		String [] str2 = {"한영", "기범", "대경", "상준", "윤영", "선주", "주영", "진호", "지효"};
		String [] title = {"상품 너무 좋아요!!", "적극 추천합니다.", "배송이 너무 빨라요", "평균 이상입니다!!", "보통이에요", "대박이에요!!", "정말 찾던 물건이에요", "재구매 예정입니다", "이런상품을 찾았어요!"};
		
		for (int i = 1; i <= 555; i ++) {
			int k1 = (int) (Math.random() * 9);
			int k2 = (int) (Math.random() * 9);
			int k3 = (int) (Math.random() * 9);
			
			vo.setWriter(str1[k1] + str2[k2]);
			vo.setTitle(title[k3]);
			System.out.println("==> vo: " + vo);
			service.insert(vo);
		}
		return "/guestBook/insertOK.jsp";
	} 

	
	@RequestMapping("/guestBookList.do")
	String guestBookList( GuestBookVO vo, Model model ) {
		
		model.addAttribute("li", service.list(vo));
		
		return "/guestBook/guestBookList.jsp";
	} 
	
	@RequestMapping("/guestCount.do")
	String guestCount( GuestBookVO vo, Model model ) {
		
		service.totalCount(vo);
		
		return "/guestBook/guestBookList.jsp";
	} 
	
}
