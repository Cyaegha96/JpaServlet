package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class thirdServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException{
		System.out.println("init 메서드 호출 -333");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		System.out.println("doget 메소드 호출 -333");
	
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy 메소드 호출 -333");
	}
	
}