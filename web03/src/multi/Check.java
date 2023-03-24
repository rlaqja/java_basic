package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check.do")
public class Check extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("만들어진다");
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String today = request.getParameter("today");
		String result = "그냥 있자";
		if (today.equals("맑음")) {
			result="나가자";
		}else if (today.equals("흐림")) {
			result="코딩하자";
		}else if (today.equals("비옴")) {
			result="쇼핑";
		}	
		//setContentType은 out만들때
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		
		String pass = request.getParameter("pass");
		String result = "들어올 수 없습니다.<img src='문당훈1.jpg'>";
		if (pass.equals("나는왕이다")) {
			result="들어오세요.<img src='문당훈3.jpg'>";
		}else {
			
		}
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
	}

}
