/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Felino;
import modelo.Mascota;
import vista.Vista;


    public class Controlador implements ActionListener{
    private Felino modelo;
    private Vista vista;
    public Controlador(Felino modelo, Vista vista){
        this.modelo= modelo;
        this.vista= vista;
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
    }

   
    public void iniciarVista(){
        vista.setVisible(true);
       
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    }
    