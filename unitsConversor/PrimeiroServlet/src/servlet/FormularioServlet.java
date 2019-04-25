package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormularioServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  PrintWriter out = resp.getWriter();
	  String nomeUsuario = req.getParameter("nome");
	  String idade = req.getParameter("idade");
	  out.println("<html>");
	  out.println("<head>");
	  out.println("<title>Teste Servlet</title>");
	  out.println("</head>");
	  out.println("<body>");
	  out.println("<h1>Teste servlet</h1>");
	  out.println("<h2>Olá!!<h2>");
	  out.println("<h2>" + nomeUsuario + ", " + idade + " anos, seja bem-vindo(a)!!!<h2>");
	  out.println("</body>");
	  out.println("</html>");
	}
}
	  
