package ru.ranu.servlets;

import ru.ranu.repositore.UsersRepository;
import ru.ranu.repositore.UsersRepositoryInMemoryImpl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UsersRepository usersRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
            this.usersRepository = new UsersRepositoryInMemoryImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().getRequestDispatcher("/JSP/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        if(usersRepository.isExist(name, password)){
            HttpSession session = req.getSession();
            session.setAttribute("user", name);
            req.getServletContext().getRequestDispatcher("/home").forward(req,resp);
        }else {
            resp.sendRedirect(req.getContextPath() + "/login");
        }
    }
}
