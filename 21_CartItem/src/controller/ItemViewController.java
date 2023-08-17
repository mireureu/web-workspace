package controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Item;
import model.ItemDAO;

public class ItemViewController implements Controller{
	
	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		
		ItemDAO.getInstance().updateRecordCount(id);
		
		Item item = ItemDAO.getInstance().getItem(id);
		request.setAttribute("item", item);
		
//		System.out.println("item :: "+item);
		
		System.out.println("f-" + id);
		Cookie cookie = new Cookie("f-" + id, item.getPictureUrl());
		cookie.setMaxAge(24*60*60);
		
//		System.out.println(cookie.getName()); 
		
		// 2) 생성한 쿠키를 웹브라우저로 보냄
		response.addCookie(cookie);
		
//			HttpSession session = request.getSession();
//			session.setAttribute("item", item);
		
		return new ModelAndView("itemView.jsp");
	}
}
