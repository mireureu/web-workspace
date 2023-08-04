package servlet.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpFormServlet
 */
public class HttpFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * 한글처리..양방향!
		 * */
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("userId");
		String password = request.getParameter("userPwd");
		
		String[] menuList = request.getParameterValues("menu");
		
		String gender = request.getParameter("gender");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h2>안녕하세요 감사해요 잘있어요 다시만나요</h2>");
		out.println("<p>" + "d아이디는~" + id + password + "메뉴는~" + "<p>");
		//당신의 성별은 --> form.html 라디오 사용!
		out.println("<p>" + gender + "</p>");
		System.out.println(gender.charAt(0) == 'M');
		out.println("<p>" + (gender.charAt(0) == 'M' ? "남자" : "여자") +  "</p>");
		out.println("<ul>");
		for(int i=0;i<menuList.length;i++) { 
			out.println("<li>" + menuList[i] + "</li>");
		}
		out.println("</ul>"); 
		out.println("</body></html>");
		out.close();
	}
	

}
