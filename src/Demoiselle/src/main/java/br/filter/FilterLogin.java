/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author bruno
 */
@WebFilter(filterName = "FilterLogin", urlPatterns = {"/faces/operacoes/*", "/faces/navegacao/*"})
public class FilterLogin implements Filter {

    public FilterLogin() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession(false);

        System.out.println("requisicao:: :: " + req.getRequestURI());
        if (session != null && (session.getAttribute("user") != null)
                || (req.getRequestURI().endsWith("login.xhtml"))
                || (req.getRequestURI().endsWith("loginCliente.xhtml"))
                || (req.getRequestURI().contains("javax.faces.resource/"))
                || (req.getRequestURI().contains("/faces/resources"))
                || (req.getRequestURI().equals("/faces/index.xhtml"))) {
         
            chain.doFilter(request, response);
        } else if (req.getRequestURI().contains("navegacao")) {
            HttpServletResponse resp = (HttpServletResponse) response;
            resp.sendRedirect(req.getContextPath() + "/faces/loginCliente.xhtml");
        } else {
            HttpServletResponse resp = (HttpServletResponse) response;
            resp.sendRedirect(req.getContextPath() + "/faces/login.xhtml");
        }

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
    
    

}
