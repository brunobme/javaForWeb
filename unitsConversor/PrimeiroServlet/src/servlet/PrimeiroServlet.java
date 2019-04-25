package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiroServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html");
		out.println("<head>");
		out.println("<title>Primeiro Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Olá! Primeiro Servlet!</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
