<%-- 
    Document   : EditarA
    Created on : 8/05/2023, 09:19:30 PM
    Author     : APRENDIZ
--%>

<%@page import="Model.Aprendiz"%>
<%@page import="ModelDao.AprendizDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <body>
  <div id="contenedor">
    <div id="datos">
      <h1>Editar aprendiz</h1>
      <%
          AprendizDao ape = new AprendizDao();
          int id = Integer.parseInt((String)request.getAttribute("id"));
          Aprendiz ap = new Aprendiz();
          ap=ape.list(id);

          %>
      <form action="../ControladorAprendiz">
          Id:<br>
          <input class="form-control" type="number" name="txtid" value="<%=ap.getId() %>"><br>
          Documento:<br>
          <input class="form-control" type="number" name="txtdoc" value="<%=ap.getDocuApre()%>"><br>
          Nombres:<br>
          <input class="form-control" type="text" name="txtNom" value="<%=ap.getNombre()%>"><br>
          Apellidos:<br>
          <input class="form-control" type="text" name="txtApe" value="<%=ap.getApellido()%>"><br>
          Email:<br> 
          <input class="form-control" type="text" name="txtEmail" value="<%=ap.getCorreo()%>"><br>
          Telefono:<br>
          <input class="form-control" type="text" name="txttel" value="<%=ap.getTeleApre()%>"><br>
          <br>
          <input class="btn btn-primary" type="submity" name="accion" value="Actualizar">

        
        
      </form>
    </div>
  </div>
    
</body>
</html>

