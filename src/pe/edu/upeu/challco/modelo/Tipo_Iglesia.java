/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.challco.modelo;

/**
 *
 * @author alum.fial7
 */
public class Tipo_Iglesia {
    private int idti;
    private String nomtipo;

    public Tipo_Iglesia() {
    }

    public Tipo_Iglesia(String nomtipo) {
        this.nomtipo = nomtipo;
    }

    public int getIdti() {
        return idti;
    }

    public void setIdti(int idti) {
        this.idti = idti;
    }

    public String getNomtipo() {
        return nomtipo;
    }

    public void setNomtipo(String nomtipo) {
        this.nomtipo = nomtipo;
    }
    
    
}
