package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginTest
 */
@WebServlet("/loginTest")
public class LoginTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		System.out.println("아이디: "+user_id);
		System.out.println("비밀번호: "+user_pw);
		
		String html = "<html><body>";
		if(user_id != null && (user_id.length() !=0)) {

			html += user_id + "님!! 로그인 하셨습니다.";
			html += "</body>";
			html += "</html>";
			out.print(html);
		}else {
			html += "아이디를 입력하세요!";
			html += "<br>";
			html += "<a href='http://localhost:8080/pro06/test01/login.html'>로그인창으로 이동<a/>";
			html += "</body>";
			html += "</html>";
			out.print(html);
		}
		
	}

}
