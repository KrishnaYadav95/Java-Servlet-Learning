import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/oldservletApp")
public class ServletApp extends HttpServlet {
    protected void doGet(HttpServletRequest request , HttpServletResponse response)  throws ServletException, IOException{
        System.out.println("control in service/controller");
       String name= request.getParameter("uname");
     String city=   request.getParameter("ucity");
     if(name.equals("Rohan")&& city.equals("Pune")){
         System.out.println("Success he is the right rohan");
     }else{
         System.out.println("he is different user");
     }
    }
}
