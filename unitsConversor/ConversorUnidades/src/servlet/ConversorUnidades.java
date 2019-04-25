package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConversorUnidades extends HttpServlet{
	public double Conversor(String de, String para, double val) {
		double toMeter = 1, fromMeter = 1;
		switch (de) {
			case "m":
				toMeter = 1;
				break;
			case "km":
				toMeter = 0.001;
				break;
			case "in":
				toMeter = 39.3701;
				break;
			case "ft":
				toMeter = 3.2808;
				break;
			case "yd":
				toMeter = 1.0936;
				break;
			case "mi":
				toMeter = 0.0006;
				break;
			default:
				System.out.println("Entrada inválida.");
				break;
		}
		switch (para) {
			case "m":
				fromMeter = 1;
				break;
			case "km":
				fromMeter = 0.001;
				break;
			case "in":
				fromMeter = 39.3701;
				break;
			case "ft":
				fromMeter = 3.2808;
				break;
			case "yd":
				fromMeter = 1.0936;
				break;
			case "mi":
				fromMeter = 0.0006;
				break;
			default:
				System.out.println("Entrada inválida.");
				break;
		}
		return ((val/toMeter)*fromMeter);				
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  PrintWriter out = resp.getWriter();
	  double valor = Double.parseDouble(req.getParameter("valor"));
	  String uni_de = req.getParameter("unidade_de");
	  String uni_para = req.getParameter("unidade_para");
	  out.println(
			  "<html>"
					  + "<head>"
					  	+ "<title>Resultado da Conversão</title>"
					  + "</head>"
					  + "<body>"
					  	+ "<h1>Conversão de Medidas Up</h1>");
	  out.println("<h2>Valor digitado: " + valor + uni_de + ", corresponde a:</h2>");
	  out.println("<p>" + Conversor(uni_de, uni_para, valor) + uni_para + "</p>");
	  out.println("</body></html>");
	}
}
