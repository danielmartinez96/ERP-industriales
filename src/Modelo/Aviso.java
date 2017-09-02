/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Diego
 */
public class Aviso {

    private String codOperacion = "MIFA001";   //SE AGREGA ESTE CODIGO PARA EL FILTRO EN EL FORMULAIO PRINCIPAL.
    private int ID;
    private String txtBreve;
    private String txtExtendido;
    private String FechaCreacion;
    private int Solicitante;
    private String Prioridad;
    private String Tipo;
    private String SectorResponsable;
    private String Equipo;

    public void setNuevoAviso(String txtBreve, String txtExtendido, String FechaCreacion, int Solicitante, String Tipo,
            String Prioridad, String SectorResponsable, String Equipo) {
        this.txtBreve = txtBreve;
        this.txtExtendido = txtExtendido;
        this.FechaCreacion = FechaCreacion;
        this.Solicitante = Solicitante;
        this.Tipo = Tipo;
        this.Prioridad = Prioridad;
        this.SectorResponsable = SectorResponsable;
        this.Equipo = Equipo;

    }

    public String getCodOperacion() {
        return codOperacion;
    }

    public void setCodOperacion(String codOperacion) {
        this.codOperacion = codOperacion;
    }
    
    /*
     public void Alta() {
     String cadena = "insert into Aviso "
     + "(txtBreve,txtExtendido,FechaCreacion,Solicitante,Tipo,Prioridad,SectorResponsable,Equipo) "
     + "values ('" + this.txtBreve + "','" + this.txtExtendido + "','" + this.FechaCreacion
     + "','" + this.Solicitante + "','" + this.Tipo + "','" + this.Prioridad + "','" + this.SectorResponsable
     + "','" + this.Equipo + "')";
     System.out.println(cadena);

     BD.getInstancia().InsertarOEliminar(cadena);
     }

     public void Eliminar(int id) {
     String cadena = "DELETE FROM Aviso WHERE ID='" + id + "'";
     System.out.println(cadena);
     BD.getInstancia().InsertarOEliminar(cadena);
     }

     public void Update(int ID) {
     String cadena = "UPDATE Aviso SET "
     + "txtBreve='" + this.txtBreve + "', "
     + "txtExtendido='" + this.txtExtendido + "', "
     + "Solicitante='" + this.Solicitante + "', "
     + "Tipo='" + this.Tipo + "', "
     + "Prioridad='" + this.Prioridad + "', "
     + "SectorResponsable='" + this.SectorResponsable + "', "
     + "Equipo='" + this.Equipo + "' where ID=" + ID;
     System.out.println(cadena);

     BD.getInstancia().Modificar(cadena);
     }

     public void OTGenerada(int ID) {
     String cadena = "UPDATE Aviso SET Estado='PROC' where ID=" + ID;

     BD.getInstancia().Modificar(cadena);
     }

     public void Cerrar(int ID) {
     String cadena = "UPDATE Aviso SET Estado='COMP' where ID=" + ID;

     BD.getInstancia().Modificar(cadena);
     }
     */

    
}
