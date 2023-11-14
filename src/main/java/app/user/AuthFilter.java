package app.user;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Asus on 2023/11/14.
 */
public class AuthFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {

    }
}
