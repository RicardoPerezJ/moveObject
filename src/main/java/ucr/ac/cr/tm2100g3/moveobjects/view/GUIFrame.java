/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100g3.moveobjects.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ricardo
 */
public class GUIFrame extends JFrame{
    
    private JButton btnMove;
    //private JPanel canva;
    private PanelCanva panelCanva;
    public GUIFrame(int widght, int height){
        this.setSize(widght, height);
        this.setVisible(true);
    }
    
    public GUIFrame(){
        this.btnMove = new JButton("Move object");
        this.panelCanva = new PanelCanva();
        
     //   this.canva = new JPanel();
       // this.canva.setBackground(Color.red);
        
     //   this.add(this.canva,BorderLayout.CENTER);
        this.add(this.btnMove, BorderLayout.SOUTH);
        this.panelCanva.setBackground(Color.blue);
        this.add(this.panelCanva, BorderLayout.CENTER);
        
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
