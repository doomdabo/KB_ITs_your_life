package web0414.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogInServlet
 */
@WebServlet("/login")
public class LogInServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub'
		response.setContentType("text/html;charset=UTF-8");
		String mid = request.getParameter("mid");
		String pwd = request.getParameter("pwd");
		if(mid.equals("abc") && pwd.equals("123")) {
			HttpSession session = request.getSession();
			session.setAttribute("login_id", "abc");
			response.getWriter().println("로그인success");
			return;
		}
		response.getWriter().println("로그인fail");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
