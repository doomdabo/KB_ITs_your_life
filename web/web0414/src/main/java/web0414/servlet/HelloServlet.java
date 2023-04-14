package web0414.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(
      asyncSupported = true, 
      urlPatterns = { 
            "/HelloServlet", 
            "/Hello"
      })
//http://localhost:8080/Webb0414/까지가 기본 . 뒤에가 호출url
public class HelloServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   
   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      PrintWriter writer=response.getWriter();/*.append("Served at: ").append(request.getContextPath()*/
      /*
       * writer.println("hello"); writer.println("helloserve");
       */
      //html형태로 보내야함
      writer.println("<html>");
      writer.println("<body>");
      writer.println("<h1>hello</h1>");
      writer.println("<p>servlet</p>");
      writer.println("</body>");
      writer.println("</html>");
   }
//HttpServletRequest 요청정보담아있는 클래스 request 요청뽑아냄, 
   //HttpServletResponse response 서블릿이 브라우저로 응답데이터를 전송할때사용하는 클래스 
   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}