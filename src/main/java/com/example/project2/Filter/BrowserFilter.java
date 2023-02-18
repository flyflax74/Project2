package com.example.project2.Filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.LogRecord;

public class BrowserFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String userAgent = request.getHeader("User-Agent");
        if (userAgent != null && userAgent.contains("Postman")) {
            ((HttpServletResponse) servletResponse).addHeader("Agent", "Filter");
            ((HttpServletResponse) servletResponse).setStatus(HttpServletResponse.SC_FORBIDDEN);

            Map<String, String> msg = new HashMap<>();
            msg.put("timestamp", LocalDateTime.now().toString());
            msg.put("status", String.valueOf(HttpServletResponse.SC_FORBIDDEN));
            msg.put("error", String.valueOf(HttpStatus.FORBIDDEN));
            msg.put("message", "Your request comes from Postman");
            msg.put("path", ((HttpServletRequest) servletRequest).getRequestURI());

            servletResponse.getWriter().write(new ObjectMapper().writeValueAsString(msg));
        } else
            filterChain.doFilter(servletRequest, servletResponse);



    }

    @Override
    public void destroy() {

    }
}
