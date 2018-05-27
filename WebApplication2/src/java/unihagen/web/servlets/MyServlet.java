package unihagen.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="MyServlet", urlPatterns={"/bla"})
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String jspPath;
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ("kurs1796".equals(username) && "geheim".equals(password)) {
            request.setAttribute("username", username);
            jspPath = "/signedIn.jsp";
        } else {
            request.setAttribute("errorOccurred", true);
            jspPath = "/start.jsp";
        }
        
        RequestDispatcher jsp = request.getRequestDispatcher(jspPath);
        jsp.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
