package Servet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;
import Pacote1.Categorias;
import Teste.CategorisTeste;


/**
 * Servlet implementation class Servet
 */
@WebServlet("/Servet")
public class Servet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	    private String Name;
	    private String senha;
	    private String data;
	    private String tel;
	    private String rg;
	    private String cpf;
	    private String email;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servet() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   String dados_log = request.getParameter("log");
	         
		   request.setAttribute("log",dados_log);
		   request.getRequestDispatcher("Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
	
	
	
	try {
	    
        Name = request.getParameter("nome");
        senha = request.getParameter("senha");
        data = request.getParameter("date");
        tel = request.getParameter("Tel");
        rg = request.getParameter("rg");
        cpf = request.getParameter("cpf");
        email = request.getParameter("email");
      
        
        request.setAttribute("nome",Name);
        request.setAttribute("senha",senha);
        request.setAttribute("idade",idade(data));
        request.setAttribute("date",data);
        request.setAttribute("Tel",tel);
        request.setAttribute("rg",rg);
        request.setAttribute("cpf",cpf);
        request.setAttribute("email",email);
         
       
        
	   }catch(Exception e){
		   System.err.println("Fatal Erro"+e);   
		   
	   }
	
	
	
	
	
	
	try {
		
		 String salario =  request.getParameter("salario");
	     double valor = Double.parseDouble(salario);
		 request.setAttribute("vl_salario1",contaSalario(valor));
		// System.out.println("RS"+valor+"Conta:"+contaSalario(valor));
		 
		 
	}catch(Exception e) {
		
		 System.err.println("Erro na Manipulação de Dados(Conta)"+e);   
		 request.setAttribute("vl_salario",null);
	}
	 request.getRequestDispatcher("Login.jsp").forward(request, response);
}
	
	
	public double contaSalario(double salario) {
	        return salario * 1.1;
	}
	
	
	
	
	       /* Calcular idade*/
	public int  idade(String data) {
		final int atual = 2019;
		String [] sp = data.split("/");
		int data_int = Integer.parseInt(sp[0]);
		
		return atual - data_int;
	}
	
	
	

}





