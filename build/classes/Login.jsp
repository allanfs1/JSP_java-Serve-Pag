<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Salario</title>
</head>
<body>

                           <!--Login-->
<div>
    <froms>
        Aumento:<input type="text" value= "<%out.print(request.getAttribute("vl_salario1"));%>"/>
    </froms>
<div>  
    
 <div>  
  <br/>
  
    <table width="500" border="3">
         <tr>
         <td colspan="8"> <small>Dados Coletado no Formulário de Cadastro</small></td>
         </tr>
    
         <tr>
             <td width="50"><b>Nome:</b></td>
             <td><b>Idade:</b></td>
             <td><b>RG:</b></td>
             <td><b>CPF:</b></td>
             <td><b>Email:</b></td>
             <td><b>Telefone:</b></td>
             <td><b>Salario:</b></td>      
             <td><b>senha:</b></td>   
         </tr>
         
          <tr>
             <td width="50"><%out.print(request.getAttribute("nome"));%></td>
             <td><%out.print(request.getAttribute("idade"));%></td>
             <td><%out.print(request.getAttribute("rg"));%></td>
             <td><%out.print(request.getAttribute("cpf"));%></td>  
             <td><%out.print(request.getAttribute("email"));%></td>
             <td><%out.print(request.getAttribute("Tel"));%></td>    
             <td><%out.print(request.getAttribute("salario"));%></td>
             <td><%out.print(request.getAttribute("senha"));%></td>                
         </tr>
         
          <tr>
             <td width="50"><%out.print(request.getAttribute("nome"));%></td>
             <td><%out.print(request.getAttribute("idade"));%></td>
             <td><%out.print(request.getAttribute("rg"));%></td>
             <td><%out.print(request.getAttribute("cpf"));%></td>  
             <td><%out.print(request.getAttribute("email"));%></td>
             <td><%out.print(request.getAttribute("Tel"));%></td>    
             <td><%out.print(request.getAttribute("salario"));%></td>
             <td><%out.print(request.getAttribute("senha"));%></td>            
         </tr>
         
         
    </table>
<div>    
    <form  action="index.jsp" method="GET">  
    Escolha a cor: <br><br>  
    <input type="color" name="upclick" value="#a52a2a"> Cor Primaria<br><br>  
    <input type="color" name="downclick" value="#f5f5dc">Cor Secundaria
</form> 
 <br>
   
           
</body>
</html>