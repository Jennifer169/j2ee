import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response){

        try {
            response.getWriter().println("<h1>Hi Servlet! this is v2.</h1>");
            response.getWriter().println(new Date());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
