/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelDao;


import Config.Conexion;
import Interfaz.MeAprendiz;
import Model.Aprendiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author APRENDIZ
 */
public class AprendizDao implements MeAprendiz{

    Conexion co= new Conexion();
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Aprendiz usu = new Aprendiz();
    
    
    @Override
    public Aprendiz list(int ide) {
        String sql="select*from aprendiz where id="+ide;
        try{
            cn=co.getConnection();
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                usu.setId(rs.getInt("id"));
                usu.setDocuApre(rs.getInt("Docu"));
                usu.setNombre(rs.getString("NombreA"));
                usu.setApellido(rs.getString("ApellidoA"));
                usu.setCorreo(rs.getString("EmailA"));
                usu.setTeleApre(rs.getInt("TelefonoA"));
            }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No puede traer la informacion");
        }
        return usu;
    }

    @Override
    public List listadoA() {
     ArrayList<Aprendiz> lista = new ArrayList<Aprendiz>();
     String sql = "select * from aprendiz";
        try {
            cn=co.getConnection();
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Aprendiz usu = new Aprendiz();
                usu.setId(rs.getInt("id"));
                usu.setDocuApre(rs.getInt("Docu"));
                usu.setNombre(rs.getString("NombreA"));
                usu.setApellido(rs.getString("ApellidoA"));
                usu.setCorreo(rs.getString("EmailA"));
                usu.setTeleApre(rs.getInt("TelefonoA"));
                lista.add(usu);
               

            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public boolean registrarAp(Aprendiz ap) {
        
        String sql="insert into Aprendiz(Docu,NombreA,ApellidoA,EmailA,TelefonoA)values('"+ap.getDocuApre()+"','"+ap.getNombre()+"','"+ap.getApellido()+"','"+ap.getCorreo()+"','"+ap.getTeleApre()+"')";
        try{
            cn=co.getConnection();
            ps=cn.prepareStatement(sql);
            ps.executeUpdate();
           /* while(rs.next()){
                ape.setId(rs.getInt("id"));
                ape.setDocuApre(rs.getInt("Docu"));
                ape.setNombre(rs.getString("NombreA"));
                ape.setApellido(rs.getString("ApellidoA"));
                ape.setCorreo(rs.getString("CorreoA"));
                ape.setTeleApre(rs.getInt("TelefonoA"));
            }*/
           JOptionPane.showMessageDialog(null,"Aprendiz registrado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Aprendiz no registrado");
        }
        return false;
    }
    

    @Override
    public boolean actualizarAp(Aprendiz ap) {
       String sql = "update Aprendiz set Docu='"+usu.getDocuApre()+"',NombreA='"+usu.getNombre()+"',ApellidoA='"+usu.getApellido()+"',EmailA='"+usu.getCorreo()+"',TelefonoA='"+usu.getTeleApre()+"' where id="+usu.getId();
            
       try{
            cn=co.getConnection();
            ps=cn.prepareStatement(sql);
            ps.executeUpdate();
        }catch (Exception e){
        }
        return false;
    }

    @Override
    public boolean eliminarAp(int id) {
        String sql="delete from aprendiz where id="+id;
        try{
            cn=co.getConnection();
            ps=cn.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Aprendiz eliminado");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Aprendiz no se puede eliminar");
        }
        return false;
    }
    
}
