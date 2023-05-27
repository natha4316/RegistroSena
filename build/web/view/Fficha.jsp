<%@page import="Model.Aprendiz"%>
<%@page import="ModelDao.AprendizDao"%>
<%@page import="java.util.List"%>
<%@page import="Model.Programa"%>
<%@page import="ModelDao.ProgramaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Agregar Ficha!</h1>
         <div class="container">    
            <div class="col-lg-6">
                <form action="ControladorAprendiz">
                    
                <label for="Codficha">Código de la ficha</label>
                <input type="text" id="Codficha" name="txtCodficha">

                  <br>
                <label> # de aprendices </label><!-- comment -->
                    
                <input class="form-control" type="text"  name="txtnumapre">
                
                

                 <br>
                 

                <div class="form-group">
                    <label> Nombre Programa:</label>
                    <select name="listarpro" class="custom-select"> 
                        <option value="0"></option>
                        <%ProgramaDao pro=new ProgramaDao();
                        List<Programa>lista=pro.listadopro();
                        %>
                        
                        <%for (Programa li:lista){%>
                        <option value="<%=li.getCodprograma()%>"><%=li.getNomprograma()%></option>
                        <%}%>
                    </select>
                    
                </div>
                    <br>
                    <duv class="form-group">
                        <label>Lista Aprendices:</label>
                        <select name="listarAPRE" class="custom-select"> 
                        <option value="0"></option>
                        <% AprendizDao ape = new AprendizDao();
                        List<Aprendiz>list= ape.listadoA();
                        %>
                        
                        <%for (Aprendiz li:list){%>
                        <option value="<%=li.getId()%>"><%=li.getDocuApre()%></option>
                        <%}%>
                    </select>

              

                 <br>
                
                <input class="btn-btn-primary" type="submit" name="accion" value="AgregarP">

                

               </form>
            </div>
    </body>
</html>