/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaDocente;

/**
 *
 * @author Administrador
 */
public class EventoVentanaDocente implements ActionListener {
    
    private VentanaDocente vD;

    public EventoVentanaDocente(VentanaDocente vD) {
        this.vD = vD;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    
}
