/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import javax.swing.*;
/**
 *
 * @author BSDsoporte
 */
public class window extends JFrame{
    JMenuBar menuBar;
    JMenu menu, submenu;
    JMenuItem menuItem;
    JRadioButtonMenuItem rbMenuItem;
    JCheckBoxMenuItem cbMenuItem;    
    JFrame frame;
    JButton button1,button2;
    JPanel panel;
    JTextArea area;
    public void crearVentana(){        
        frame = new JFrame("Grafos");         
        frame.setSize(800, 600);
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
        panel.add(Box.createRigidArea(new Dimension(0,5)));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));        
        area = new JTextArea(1, 1);
        area.add(Box.createRigidArea(new Dimension(0,3)));
        area.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));        
        area.setVisible(true);
        Container contentPane = getContentPane();        
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(area, BorderLayout.PAGE_END);
        
               
//        menuBar = new JMenuBar();
//        menu = new JMenu("A menu");
//        menuBar.add(menu);        
//        frame.setJMenuBar(menuBar);
//        button1 = new JButton("Ok");                
//        frame.getContentPane().add(button1);                
        frame.setLocationRelativeTo(null);                                               
        frame.setVisible(true);        
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                                             
        
    }
}
