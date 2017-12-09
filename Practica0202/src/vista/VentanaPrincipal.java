/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import controlador.GestionDato;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Administrador
 */
public class VentanaPrincipal extends JFrame{
    
    private JDesktopPane escritorio;
    private JMenuBar barraMenu;
    private List<JMenu> menuList;
    private List<JMenuItem> itemMenuList;
    private GestionDato gd;
    
    private VentanaCurso vCurso;
    private VentanaDocente vDocente;
    private VentanaMateria vMateria;
    
    public VentanaPrincipal(String title, GestionDato gd){
        super(title);
        this.setSize(820, 720);
        this.setDefaultCloseOperation(3);
        this.gd = gd;
        this.iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
    }

    
}
