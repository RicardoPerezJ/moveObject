/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100g3.moveobjects.view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


/**
 *
 * @author Ricardo
 */
public class PanelCanva extends JPanel{
    private int x;
    private int y;

    public PanelCanva() {
        this.x=20;
        this.y=20;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.fillOval(x, y, 25, 25);
        g.fillRect(50, 100, 50, 30);
    }
    
    
}