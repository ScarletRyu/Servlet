package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Libro;
import modelo.LibroModelo;

public class ListarLibros extends HttpServlet{
	 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		 
		 LibroModelo libroModelo = new LibroModelo();
		 ArrayList<Libro> libros = libroModelo.selectAll();
		 
		 request.setAttribute("libros", libros);
		 
		 RequestDispatcher rd = request.getRequestDispatcher("vista/libros/Listado.jsp");
		 rd.forward(request, response);
	 }
	
}
