/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Event.*;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
/**
 *
 * @author BSDsoporte
 */
public class window extends JFrame{
    public JMenuBar menuBar;
    public JMenu menu, submenu;
    public JMenuItem menuItem;
    public JRadioButtonMenuItem rbMenuItem;
    public JCheckBoxMenuItem cbMenuItem;    
    public JFrame frame;
    public JButton button1,button2;
    public JPanel panel, buttonPanel, paintPanel, optionPanel;
    public JTextArea area;    
    public void crearVentana(){        
        frame = new JFrame("Grafos");         
        panel = new JPanel();        
        paintPanel = new JPanel();
        button1 = new JButton("Aceptar");
        button2 = new JButton("Cancelar");
        area = new JTextArea();
        frame.setSize(800, 600);           
        dibujarPuntos d = new dibujarPuntos();
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));                
        panel.add(Box.createRigidArea(new Dimension(0, 5)));        
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));          
        paintPanel.setBackground(Color.WHITE);
        panel.add(paintPanel);
        panel.addMouseListener(d);
        
        optionPanel = new JPanel();        
        optionPanel.setLayout(new BoxLayout(optionPanel, BoxLayout.LINE_AXIS));
        optionPanel.add(Box.createRigidArea(new Dimension(0, 5)));        
        optionPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));        
        optionPanel.setBackground(Color.yellow);
                      
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));        
        buttonPanel.add(Box.createHorizontalGlue());
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                paintPanel.repaint();
            }
        });
        buttonPanel.add(button1);        
        buttonPanel.setBackground(Color.BLACK);
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        buttonPanel.add(button2);               
                
        Container contentPane = getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.PAGE_END);
        contentPane.add(optionPanel, BorderLayout.LINE_START);        
        frame.add(contentPane);
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
    public class dibujarPuntos extends window implements MouseListener{
        private Color background;                
        private final int radio = 8;
        @Override
        public void mousePressed(MouseEvent e) {               
            Graphics g = window.this.paintPanel.getGraphics();            
            g.setColor(Color.BLACK);
            g.fillOval(e.getX(), e.getY(), radio, radio);            
            g.dispose();
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            setBackground(background);
        }        

        @Override
        public void mouseClicked(MouseEvent me) {
            
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            
        }

        @Override
        public void mouseExited(MouseEvent me) {
            
        }
    }
}