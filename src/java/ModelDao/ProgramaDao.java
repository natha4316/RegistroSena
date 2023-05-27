/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelDao;

import Config.Conexion;
import Interfaz.MePrograma;
import Model.Programa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author APRENDIZ
 */
public class ProgramaDao implements MePrograma{

    Conexion cn = new Conexion();
    Programa po = new Programa();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
        
    @Override
    public Programa list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listadopro() {
        ArrayList<Programa> lista = new ArrayList<Programa>();
     String sql = "select * from programa";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Programa pro = new Programa();
                pro.setCodprograma(rs.getInt("codprograma"));
                pro.setNomprograma(rs.getString("nombrepro"));
                lista.add(pro);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public boolean registrarpro(Programa pro) {
        String sql="insert into programa(codprograma,nombrepro)values('"+pro.getCodprograma()+"','"+pro.getNomprograma()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"programa registrado");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"programa no registrado");
        }
        
        return false;
        
        
    }

    @Override
    public boolean actualizarpro(Programa pro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarpro(int codprograma) {
        String sql="delete from programa where id="+codprograma;
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Programa eliminado");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Programa no se puede eliminar");
        }
        return false;
    }
    
}
