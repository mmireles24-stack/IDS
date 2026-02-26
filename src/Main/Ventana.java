package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
		this.setVisible(true);//para que se vea la ventana
		this.setSize(1200,600);//para que tenga medidas de cuando se crea
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//al cerrar ventana no se siga ejecutando el codigo
		//this.setLocationRelativeTo(null);//ponerla en el centro
		this.setMinimumSize(new Dimension(200,200));//da parametros de cuanto puede crecer o minimizar
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("Login");
		this.setBackground(Color.BLACK);
		this.setLocation(200,200);
		this.setLayout(null);//Es para tener un marco, aqui no tenemos por el null
		
		JPanel contenedor = new JPanel();//seria nuestra hoja
		contenedor.setOpaque(true);
		contenedor.setBackground(new Color(245, 247, 250));
		contenedor.setSize(500,500);
		contenedor.setLocation(0,0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		
		JLabel title_login = new JLabel();
		title_login.setText("Bienvenido");
		title_login.setSize(500,50);
		title_login.setOpaque(false);
		title_login.setLocation(0,40);
		//title_login.setBackground(Color.gray);
		title_login.setFont(new Font("Segoe UI", Font.BOLD, 38));//Para darle fuente al texto
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JTextField username = new JTextField();
		username.setSize(300,30);
		username.setLocation(100,160);
		username.setBackground(Color.WHITE);
		username.setFont(new Font("Segoe UI",Font.BOLD,22));
		contenedor.add(username);
		
		JLabel usuario= new JLabel();
		usuario.setText("Usuario:");
		usuario.setSize(200,30);
		//usuario.setOpaque(true);
		usuario.setLocation(100,130);
		usuario.setFont(new Font("Segoe UI", Font.PLAIN, 20));//Para darle fuente al texto
		usuario.setHorizontalAlignment(JLabel.LEFT);
		contenedor.add(usuario);
		
		JPasswordField password = new JPasswordField();
		password.setSize(300,30);
		password.setLocation(100,250);
		password.setBackground(Color.WHITE);
		password.setFont(new Font("Segoe UI",Font.BOLD,22));
		contenedor.add(password);
		
		JLabel contraseña= new JLabel();
		contraseña.setText("Contraseña:");
		contraseña.setSize(200,30);
		//usuario.setOpaque(true);
		contraseña.setLocation(100,220);
		contraseña.setFont(new Font("Segoe UI", Font.PLAIN, 20));//Para darle fuente al texto
		contraseña.setHorizontalAlignment(JLabel.LEFT);
		contenedor.add(contraseña);
		
		JCheckBox recordar = new JCheckBox();
		recordar.setText("Recordarme");
		recordar.setSize(150,30);
		recordar.setLocation(100,290);
		recordar.setBackground(new Color(245, 247, 250));
		recordar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		contenedor.add(recordar);
		
		JLabel olvido = new JLabel();
		olvido.setText("¿Olvidó su contraseña?");
		olvido.setSize(200,30);
		olvido.setLocation(250,290);
		olvido.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		olvido.setForeground(new Color(33,150,243));
		contenedor.add(olvido);
		
		JButton acceder= new JButton();
		acceder.setText("Acceder");
		acceder.setSize(180,50);
		acceder.setLocation(160,360);
		acceder.setFont(new Font("Segoe UI",Font.BOLD,22));
		acceder.setBackground(new Color(33, 150, 243));
		acceder.setForeground(Color.WHITE);
		contenedor.add(acceder);
		
		
		contenedor.repaint();//refrescar la ventana una vez ejecutada 
		contenedor.revalidate();
		
		//REGISTER---
		
		JPanel register_container = new JPanel();//seria nuestra hoja
		register_container.setOpaque(true);
		register_container.setBackground(new Color(238, 242, 246));
		register_container.setSize(500,500);
		register_container.setLocation(650,0);
		register_container.setLayout(null);
		this.add(register_container);
		
		JLabel registro = new JLabel("Registro");
		registro.setBounds(0,20,500,50);
		registro.setFont(new Font("Segoe UI", Font.BOLD, 34));
		registro.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(registro);
		
		//NOMBRE------
		JLabel nombre= new JLabel("Nombre de usuario:");
		nombre.setBounds(100,85,300,25);
		nombre.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		register_container.add(nombre);
		
		JTextField username1 = new JTextField();
		username1.setBounds(100,110,300,35);
		username1.setBackground(Color.WHITE);
		username1.setFont(new Font("Segoe UI",Font.PLAIN,18));
		register_container.add(username1);
		
		//BIOGRAFRÍA-----
		JLabel bio_tag = new JLabel("Biografía");
		bio_tag.setBounds(0,160,500,30);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setFont(new Font("Segoe UI", Font.BOLD, 20));
		register_container.add(bio_tag);
		
		JTextArea bio = new JTextArea();
		bio.setBounds(100,190,300,70);
		bio.setBorder(BorderFactory.createLineBorder(new Color(200,200,200)));
		register_container.add(bio);
		
		//PREFERENCIAS---
		JLabel preferences = new JLabel("Preferencias");
		preferences.setBounds(0,270,500,30);
		preferences.setHorizontalAlignment(JLabel.CENTER);
		preferences.setFont(new Font("Segoe UI", Font.BOLD, 20));
		register_container.add(preferences);
		
		JCheckBox sweet_option = new JCheckBox("Dulce");
		sweet_option.setBounds(110,300,90,25);
		sweet_option.setOpaque(false);
		register_container.add(sweet_option);
		
		JCheckBox salty_option = new JCheckBox("Salado");
		salty_option.setBounds(210,300,90,25);
		salty_option.setOpaque(false);
		register_container.add(salty_option);
		
		JCheckBox healthy_option = new JCheckBox("Saludable");
		healthy_option.setBounds(310,300,110,25);
		healthy_option.setOpaque(false);
		//healthy_option.setBorderPainted(true);
		//healthy_option.setBorder(BorderFactory.createLineBorder(Color.white));
		register_container.add(healthy_option);
		
		//TÉRMINOS----
		JLabel terms_text = new JLabel("Términos");
		terms_text .setBounds(0,330,500,30);
		terms_text .setHorizontalAlignment(JLabel.CENTER);
		terms_text .setFont(new Font("Segoe UI", Font.BOLD, 22));
		register_container.add(terms_text );
		
		
		JRadioButton accept_terms = new JRadioButton("Acepto terminos");
		accept_terms.setBounds(110,360,140,25);
		accept_terms.setOpaque(false);
		register_container.add(accept_terms);
		
		JRadioButton reject_terms = new JRadioButton("Rechazo terminos");
		reject_terms.setBounds(260,360,160,25);
		reject_terms.setOpaque(false);
		register_container.add(reject_terms);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(reject_terms);
		terms.add(accept_terms);
		
		String [] colonias = {"Camino Real", "La fuente", "Villas del encanto"};
		
		JComboBox list =new JComboBox(colonias);
		list.setBounds(100,395,300,30);
		register_container.add(list);
		
		JButton create_account = new JButton("Crear cuenta");
		create_account.setBounds(150,435,200,40);
		create_account.setFont(new Font("Segoe UI",Font.BOLD,22));
		create_account.setBackground(new Color(25, 118, 210));
		create_account.setForeground(Color.WHITE);
		register_container.add(create_account);
		
		
		
		
		
		
		register_container.repaint();
		
		
		
		
		
		
	}

}
