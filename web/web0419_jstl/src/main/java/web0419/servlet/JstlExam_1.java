package web0419.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JstlExam_1
 */
@WebServlet("/jstl_1.do")
public class JstlExam_1 extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("msg", "Hello JSTL");
		String[] sa = new String[] {"aaa","bbb","ccc"};
		request.setAttribute("sa", sa);
		String url = "/jstl-1.jsp";
		
		SimpleDto[] dtos = new SimpleDto[] {
				new SimpleDto("girl", new String[] {"iu", "ive"}),
				new SimpleDto("old", new String[] {"조용필", "나훈아"})
		};
		request.setAttribute("dtos", dtos);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
