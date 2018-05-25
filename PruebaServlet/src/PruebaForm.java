

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PruebaForm
 */
@WebServlet("/PruebaForm")
public class PruebaForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PruebaForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= response.getWriter();
		out.println(request.getParameter("provincia") + "<br>");
		String ok =request.getParameter("ok") + "<br>";
		if(ok == null){
			out.println("No estoy de acuerdo malpario " + request.getParameter("ok") + "<br>");
		}else{
			out.println("Si estoy de acuerdo malpario " + request.getParameter("ok") + "<br>");
		}
		
		
		String [] ingredientes = request.getParameterValues("ingredientes");
		if(ingredientes != null){
			for(int i =0; i<ingredientes.length; i++){
				out.println(ingredientes[i] + "<br>");
			}
	}
		out.println("Sexo:" + request.getParameter("sexo"));
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
