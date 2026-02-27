package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
	    public Calculadora() {
	    	 this.setSize(400,500);
	         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         this.setMinimumSize(new Dimension(200,200));
	         this.setMaximumSize(new Dimension(800,800));
	         this.setTitle("CALCULADORA");
	         this.setLocation(200,200);
	         this.getContentPane().setBackground(Color.decode("#F8E8F5"));
	         this.setLayout(null);
	         vista(); 
	         this.setVisible(true); 
	     }
	    
	    public void vista() {

	        JPanel calcu = new JPanel();
	        calcu.setBounds(0,0,400,500);
	        calcu.setOpaque(false);
	        calcu.setLayout(null); 
	        this.add(calcu);

	        
	        JTextField pantalla = new JTextField();
	        pantalla.setBounds(10,20,360,40);
	        pantalla.setFont(new Font("Segoe UI", Font.BOLD, 22));
	        calcu.add(pantalla);

	      
	        JPanel panelBotones = new JPanel();
	        panelBotones.setBounds(10,80,360,360);
	        panelBotones.setLayout(new GridLayout(5,4,5,5));
	        calcu.add(panelBotones);
	        
	        JButton c = new JButton ("C");
	        c.setBackground(Color.decode("#E89BE6"));
	        panelBotones.add(c);
	        
	        JButton ce = new JButton ("CE");
	        ce.setBackground(Color.decode("#E89BE6"));
	        panelBotones.add(ce);
	        panelBotones.add(new JButton(" "));
	        panelBotones.add(new JButton(" "));
	        
	        panelBotones.add(new JButton("7"));
	        panelBotones.add(new JButton("8"));
	        panelBotones.add(new JButton("9"));
	        JButton division = new JButton ("/");
	        division.setBackground(Color.decode("#E89BE6"));
	        panelBotones.add(division);
	       

	        panelBotones.add(new JButton("4"));
	        panelBotones.add(new JButton("5"));
	        panelBotones.add(new JButton("6"));
	        JButton multiplicacion = new JButton ("*");
	        multiplicacion.setBackground(Color.decode("#E89BE6"));
	        panelBotones.add(multiplicacion);

	        panelBotones.add(new JButton("1"));
	        panelBotones.add(new JButton("2"));
	        panelBotones.add(new JButton("3"));
	        JButton resta = new JButton ("-");
	        resta.setBackground(Color.decode("#E89BE6"));
	        panelBotones.add(resta);

	        panelBotones.add(new JButton("0"));
	        JButton punto = new JButton (".");
	        punto.setBackground(Color.decode("#E89BE6"));
	        panelBotones.add(punto);
	        JButton igual = new JButton ("=");
	        igual.setBackground(Color.decode("#E89BE6"));
	        panelBotones.add(igual);
	        JButton suma = new JButton ("+");
	        suma.setBackground(Color.decode("#EE89BE6"));
	        panelBotones.add(suma);
   
	    }
	    	    
	    	    

	    public static void main(String[] args) {
	        new Calculadora();
	    }
	}
	


	
