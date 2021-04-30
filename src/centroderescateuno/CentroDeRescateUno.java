/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centroderescateuno;

import controlado.Controlador;
import modelo.Felino;
import vista.Vista;


public class CentroDeRescateUno {

   
    public static void main(String[] args) {
     
        Felino modelo =new Felino();
        Vista vista =new Vista();
        Controlador controlador =new Controlador(modelo, vista);
        controlador.iniciarVista();
    }
    
}
