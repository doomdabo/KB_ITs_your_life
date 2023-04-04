package common;
import java.sql.*;

public class DBManager {
	   private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	   private static String user="HR";
	   private static String password="HR";
	   
	   public static Connection getConnection() throws  ClassNotFoundException, SQLException  { //발생하면 알려줄게 , 
	      // TODO Auto-generated method stub
	       Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이버 로딩 
	       //try catch 말고 throw 헤야함 , 일시킨애가 try catch 일이 발생하면, 메시지만 보내고 값을 넘겨주는 것이 아님 
	       //일하는 애가  throws
	       return DriverManager.getConnection(url,user,password); //db연결 ;
	   }//스스로하는게 아니고 시켜서 함. throw 실패할때는 항상 알려줘야함 그래서 throws

	   public static void releaseConnection(Statement pstmt, Connection con)  {
	      // TODO Auto-generated method stub
	      if (pstmt!=null) //null이 아닐때 close 을 호출 
	         try {
	            pstmt.close(); //자원을 반납하러갔는데 반납을 못받는 
	         }catch (SQLException e) {
	         }
	      if (con!=null) 
	      try{
	         con.close();
	      }catch(SQLException e) {
	      }
	   }
}
