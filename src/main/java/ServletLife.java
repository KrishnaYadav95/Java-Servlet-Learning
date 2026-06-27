import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/ServletLife")
public class ServletLife extends HttpServlet {
    static {
        System.out.println("server is loaded");
    }
    public ServletLife(){
        System.out.println("servlet object is created");
    }
    public  void init(ServletConfig config) throws ServletException {
        System.out.println("server initialised");
    }
    protected void service(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
        System.out.println("service method to handle http request and to response back");
    }
    public void destroy(){

    }
}
