<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
             <!-- index  -->
<h3><%out.println("<h3>Formulario de Cadastro</h3>"+"<p>Ficha de<SUP>Cadastro</SUP></p>");%></h3>
   <div>
     <img  src=" <%
         if(request.getParameter("arquivo") == null)
        	 out.println("Erro de importacao de foto");
         else
             out.println(request.getParameter("arquivo"));%>" width="200" height="200"></a>
          
<form method="GET">  
   <div>
        <label>Arquivo:</label>
        <input type="file" name="arquivo">
        <input type="submit"  value="Enviar">
   </div>
</form>       
            
    <form action="Servet" method="POST">
                <!-- Cadastro do Formulário -->
         <br/>
      <div>
        <label>Nome:</label>
        <input type="text" name="nome">
      </div>
          <br/>
       <div>
         <label>Senha:</label>
         <input type="password" name="senha">
       </div>
          <br/>
          
       <small><b> Ficha de Cadastro</b></small> <br><br>
         
      <div>
        <label>Salario:</label>
        <input type="text" name="salario">
        <label>Dt/-/-/-</label>
        <input type="date" name="date">
      </div> 
          <br/>
      <div>
        &emsp;<label>Tele:</label>
        <input type="text" name="Tel">
        &emsp;<label>RG:</label>
        <input type="text" name="rg">
      </div>
           <br/>
       <div>
        &emsp;<label>CPF:</label>
        <input type="text" name="cpf">
        <label>Email:</label>
        <input type="email" name="email">
        <label>Site:</label>
        <input type="url" name="website" placeholder="http://Example.com">
      </div>
         <br/>
      
      <div>
        <input type="radio" name="feminino" value="Sexo">Feminino
        <input type="radio" name="masculino" value="Sexo">Masculino<br/><br/>
        <input type="checkbox" name="solteiro" value="Solteiro">Souteiro
        <input type="checkbox" name="casado" value="Solteiro">Casado
        <input type="button" name="btn" value="click" onclick= "alert('yes')">
      </div>
        <br/>
         
       <div>
        <input type="submit"  value="Enviar">
        <input type="reset"  value="Cancelar">
      </div>
       
         </div>
  </form>
     </body>
 </html>