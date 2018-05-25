package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HolaMundo extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hola</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Llamada post, soy "+ request.getParameter("nombre") + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	
	
	
	
	
	
}
