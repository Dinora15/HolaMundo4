package unedMasterJava.HolaMundo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class Hola4
 */
public class Hola4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hola4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		PrintWriter salida=response.getWriter();
		
		salida.println("<html>");
		salida.println("<body>");
		salida.println("<h1 style='text-aligne:center'>Hola Mundo");
		
		salida.println("</h1>");
		try {
			String nombre = request.getParameter("nombre").toString();
			String apellido = request.getParameter("apellido").toString();
			

	        
	        salida.println("<h3 style='text-aligne:center'>Bienvenido " + nombre + " " + " "+ apellido+ "</h3>");
			
			
		}catch(Exception e){
			salida.println("<h1>Error en el uso de la llamada</h1>"); 
			
			
		}
		salida.println("<br>");
		salida.println("Fecha y Hora actual:"+ new Date());
		
		salida.print("</body>");
		salida.print("</html>");
		salida.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
