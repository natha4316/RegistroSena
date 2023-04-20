/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import java.util.List;
import modelo.Aprendiz;


public interface MeAprendiz {
 
    public Aprendiz list(int id);
    public List listadoA();
    public boolean registraap(Aprendiz ap);
    public boolean actualizarap(Aprendiz ap);
    public boolean eliminarap(Aprendiz ap);
    
}
