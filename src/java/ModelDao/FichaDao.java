/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import Config.Conexion;
import Interfaz.MeFicha;
import Model.Ficha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class FichaDao implements MeFicha
{
    Ficha fi=new Ficha();
   Conexion co= new Conexion();
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    
    
    
    @Override
    public Ficha list(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listaFichas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean registrarficha(Ficha fi)
    {
        String sql= "insert into ficha(codficha,cantapre,codprod,codaprendiz)values('"+fi.getCodFicha()+"','"+fi.getCantiaprendices()+"','"+fi.getCodprograma()+"','"+fi.getCodaprendiz()+"')";
        try 
        {
           cn=co.getConnection();
            ps=cn.prepareStatement(sql);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Ficha resgistrada");
            
        } catch (SQLException ex) {
            Logger.getLogger(FichaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean actualizarficha(Ficha fi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarficha(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class co {

        public co() {
        }
    }
    
}
