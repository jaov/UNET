/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import javax.swing.*;

/**
 *
 * @author jesus.ochoa
 */
public class MiFrame extends JFrame{
    JLabel milabel, random;
    JLabel labelTexto;
    JPanel mipanel;
    CargaImagen cargaImagen;


    public MiFrame() {
        
        super("River Raid");
        
        random = new JLabel(new ImageIcon(getClass().getResource("/Imagenes/Random_picture_of_shark.png")));
        cargaImagen = new CargaImagen(18,17,30,46,8,1,3,0,"src/Imagenes/Touhou.png");
        milabel = new JLabel(new ImageIcon(cargaImagen.getImagen(0, 0)));
        
        mipanel = new JPanel(null);
        mipanel.setLocation(200, WIDTH);
        
        random.setBounds(0,0,random.getIcon().getIconWidth(),random.getIcon().getIconHeight());
        
        random.setVisible(true);
        
        milabel.setBounds(300, 0,100,100);
        labelTexto = new JLabel("Por Favor");
        labelTexto.setBounds(0, 0, 600,40);
        //mipanel.setSize(800, 600);
        add(random);
        add(mipanel);
        add(labelTexto);
        labelTexto.setLocation(0, 0);
        labelTexto.setVisible(true);
        getContentPane().add(mipanel);
        //this.getContentPane().setSize(800, 600);
        setSize(800,600);

        add(milabel);
        milabel.setVisible(true);
        ;
        
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    
    
}