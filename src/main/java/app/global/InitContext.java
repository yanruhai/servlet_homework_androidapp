package app.global;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * Created by Asus on 2023/11/14.
 */
public class InitContext extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Automatic load is start");
        config.getServletContext().setAttribute("userlist",null);
        System.out.println("Automatic load is end");
    }
}
