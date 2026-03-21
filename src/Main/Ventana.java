package Main;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{

	public Ventana() {
		this.setSize(1200,1200);//para que tenga medidas de cuando se crea
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//al cerrar ventana no se siga ejecutando el codigo
		//this.setLocationRelativeTo(null);//ponerla en el centro
		this.setMinimumSize(new Dimension(200,200));//da parametros de cuanto puede crecer o minimizar
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("Login");
		this.setBackground(Color.BLACK);
		
		Toolkit logo_windows = Toolkit.getDefaultToolkit();
		Image icono = logo_windows.getImage("logoMJ.png");
		this.setIconImage(icono);
		//this.setContentPane(new JPanel() {
			
		    /*protected void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        Graphics2D g2d = (Graphics2D) g;

		        Color azul = new Color(0, 153, 255);
		        Color turquesa = new Color(0, 255, 255);

		        GradientPaint gp = new GradientPaint(
		                0, 0, azul,
		                0, getHeight(), turquesa
		        );

		        g2d.setPaint(gp);
		        g2d.fillRect(0, 0, getWidth(), getHeight());
		    }*/
		//});
		//this.getContentPane().setBackground(Color.decode("#0B0B0F"));;
		this.setLayout(null);//Es para tener un marco, aqui no tenemos por el null
		this.setLocation(200,200);
		
		/*JMenuBar barra = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");
		
		JMenuItem open = new JMenuItem("Abrir");
		JMenuItem close = new JMenuItem("Cerrar");
		JMenuItem save = new JMenuItem("Guardar");
		JMenuItem newFile = new JMenuItem("Nuevo");
		
		archivo.add(open);
		archivo.add(close);
		archivo.add(save);
		archivo.add(newFile);
		barra.add(archivo);
		
		JMenu submenu = new JMenu("Otros");
		archivo.addSeparator();
		
		JMenuItem menuItem = new JMenuItem("An item in the submenu");
		submenu.add(menuItem);
		
		menuItem = new JMenuItem("Another Item");
		submenu.add(menuItem);
		archivo.add(submenu);
		
		this.setJMenuBar(barra);*/
		//this.pintar();
		//this.casa();
		
		//this.registro();//Para mostrar el panel que queremos ver 
		this.mario();//Para mostrar el panel que queremos ver 
		this.setVisible(true);//para que se vea la ventana
}
	public void login ()//Asi se encapsulan los paneles.
	{
		JPanel contenedor = new JPanel();
		contenedor.setBackground(new Color(18, 22, 38));
		contenedor.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
		contenedor.setBounds(150, 20, 900, 500);
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
		title_login.setForeground(Color.WHITE); 
		contenedor.add(title_login);
		
		JLabel usuario= new JLabel();
		usuario.setText("Usuario:");
		usuario.setSize(200,30);
		//usuario.setOpaque(true);
		usuario.setLocation(100,130);
		usuario.setFont(new Font("Segoe UI", Font.PLAIN, 20));//Para darle fuente al texto
		usuario.setHorizontalAlignment(JLabel.LEFT);
		usuario.setForeground(new Color(180,190,210));
		contenedor.add(usuario);
		
		JTextField username = new JTextField();
		username.setSize(300,30);
		username.setLocation(100,160);
		username.setBackground(new Color(30, 35, 55));
		username.setForeground(Color.WHITE);
		username.setCaretColor(new Color(0,255,200));
		username.setFont(new Font("Segoe UI",Font.BOLD,22));
		username.setBorder(BorderFactory.createLineBorder(new Color(0,255,200),1));
		contenedor.add(username);
		
		ImageIcon iconUser = new ImageIcon("ICON USER1.PNG");
		Image imgUser = iconUser.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
		JLabel iconoUser = new JLabel(new ImageIcon(imgUser));
		iconoUser.setBounds(70, 165, 20, 20);  // ajusta posición
		contenedor.add(iconoUser);
	
		
		JLabel contraseña= new JLabel();
		contraseña.setText("Contraseña:");
		contraseña.setSize(200,30);
		//usuario.setOpaque(true);
		contraseña.setLocation(100,220);
		contraseña.setFont(new Font("Segoe UI", Font.PLAIN, 20));//Para darle fuente al texto
		contraseña.setHorizontalAlignment(JLabel.LEFT);
		contraseña.setForeground(new Color(180,190,210));
		contenedor.add(contraseña);
		
		JPasswordField password = new JPasswordField();
		password.setSize(300,30);
		password.setLocation(100,250);
		password.setBackground(new Color(30, 35, 55));
		password.setForeground(Color.WHITE);
		password.setCaretColor(new Color(0,255,200));
		password.setFont(new Font("Segoe UI",Font.BOLD,22));
		password.setBorder(BorderFactory.createLineBorder(new Color(0,255,200),1));
		contenedor.add(password);
		
		ImageIcon iconLock = new ImageIcon("ICON PASSWORD.png");
		Image imgLock = iconLock.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		JLabel iconoLock = new JLabel(new ImageIcon(imgLock));
		iconoLock.setBounds(70, 255, 20, 20);
		contenedor.add(iconoLock);
		
		
		
		JCheckBox recordar = new JCheckBox();
		recordar.setText("Recordarme");
		recordar.setSize(150,30);
		recordar.setLocation(100,290);
		recordar.setBackground(new Color(18,22,38));
		recordar.setForeground(new Color(180,190,210));
		recordar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		contenedor.add(recordar);
		
		JLabel olvido = new JLabel();
		olvido.setText("¿Olvidó su contraseña?");
		olvido.setSize(200,30);
		olvido.setLocation(250,290);
		olvido.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		olvido.setForeground(new Color(0,255,200));
		contenedor.add(olvido);
		
		JButton acceder= new JButton();
		acceder.setText("Acceder");
		acceder.setSize(180,45);
		acceder.setLocation(160,360);
		acceder.setFont(new Font("Segoe UI",Font.BOLD,22));
		acceder.setBackground(new Color(0,255,200));
		acceder.setForeground(new Color(18,22,38));
		acceder.setBorderPainted(false);
		acceder.setFocusPainted(false);
		contenedor.add(acceder);
		
		acceder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String username_val = username.getText();
				String password_val = new String(password.getPassword());
				
				String user_correcto = "Maryfer11";
				String pass_correcto = "123456";
				
				if(username_val.equals("") || username_val.contains(" ")){
					username.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
				}else { 
					username.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
				}	
				
				if(password_val.length() < 	6 || password_val.contains(" ")) {
					password.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
				}else { 
					password.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
				}	
				if(username_val.equals(user_correcto) && password_val.equals(pass_correcto)){
		            JOptionPane.showMessageDialog(null, "  Bienvenido ");
		        } else {
		            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
		        }
		    }
		});
		
		ImageIcon login = new ImageIcon("login.jpeg");

		Image img = login.getImage().getScaledInstance(400, 460, Image.SCALE_SMOOTH);
		ImageIcon loginEscalado = new ImageIcon(img);
		JLabel vista = new JLabel(loginEscalado);
		vista.setBounds(480, 20, 400, 460);

		contenedor.add(vista);
		
		
		contenedor.repaint();//refrescar la ventana una vez ejecutada 
		contenedor.revalidate();
		
		
		
	}
	
	public void registro ()
	{
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
				create_account.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						String username1_val = username1.getText();
						String bio_val = bio.getText();
						
						
						
						if(username1_val.equals("") || username1_val.contains(" ")){
							username1.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
						}else { 
							username1.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
						}	
						
						if(bio_val.equals("")) {
							bio.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
						}else { 
							bio.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
						}	
						if(!sweet_option.isSelected() && !salty_option.isSelected() && !healthy_option.isSelected()){
				            sweet_option.setForeground(Color.red);
				            salty_option.setForeground(Color.red);
				            healthy_option.setForeground(Color.red);
				        } else { 
				            sweet_option.setForeground(Color.black);
				            salty_option.setForeground(Color.black);
				            healthy_option.setForeground(Color.black);
				        }
				        
	
						 if(!accept_terms.isSelected()) {
					            accept_terms.setForeground(Color.red);
					    }else { 
					         accept_terms.setForeground(Color.black);
					        }   	
					}
					
				});
				
				
				register_container.repaint();
		
		
	}

	public void users()
	{
		
		JPanel users = new JPanel();
		users.setSize(950,500);
		users.setLocation(100,30);
		users.setBackground(Color.decode("#E3E3DC"));
		users.setLayout(null);
		this.add(users);
		
		JLabel users_title = new JLabel("Usuarios");
		users_title.setBounds(400,30,150,50);
		users_title.setHorizontalAlignment(JLabel.CENTER);
		users_title.setOpaque(true);
		users_title.setFont(new Font("Segoe UI", Font.BOLD, 22));
		users_title.setBackground((Color.decode("#EDD15F")));
		users.add(users_title);
		
		JButton export = new JButton ("Exportar");
		export.setBounds(30,120,100,40);
		users.add(export);
		
		JButton add = new JButton("Añadir");
		add.setBounds(140,120,100,40);
		users.add(add);
		
		
		
		Object [] table_head = {"NO. DE CONTROL","NOMBRE", "APELLIDOS", "SEMESTRE","PROMEDIO","ACCION"};

		Object [][] table_content = {
		        {"123","Ana","Lopez","3","9.5","Editar"},
		        {"456","Luis","Martinez","2","8.7","Editar"},
		        {"789","Sofia","Perez","5","9.1","Editar"},
		        {"321","Carlos","Gomez","1","8.9","Editar"},
		        {"654","Mariana","Torres","4","9.2","Editar"},
		        {"987","Diego","Ramirez","6","8.5","Editar"},
		        {"741","Valeria","Hernandez","2","9.8","Editar"},
		        {"852","Jorge","Castro","3","7.9","Editar"},
		        {"963","Fernanda","Vargas","5","9.0","Editar"},
		        {"159","Ricardo","Ortega","1","8.3","Editar"},
		        {"753","Camila","Rios","4","9.6","Editar"},
		        {"258","Andres","Mendoza","2","8.1","Editar"},
		        {"369","Paula","Silva","6","9.4","Editar"},
		        {"147","Daniel","Flores","3","7.8","Editar"},

		        {"2589","Natalia","Cruz","5","9.7","Editar"},
		        {"3698","Hugo","Reyes","4","8.4","Editar"},
		        {"1472","Elena","Morales","1","9.3","Editar"},
		        {"2583","Sergio","Navarro","2","8.0","Editar"},
		        {"3694","Lucia","Delgado","6","9.1","Editar"},
		        {"7412","Miguel","Santos","3","7.7","Editar"},
		        {"8523","Diana","Guerrero","4","9.9","Editar"},
		        {"9634","Emilio","Paredes","5","8.6","Editar"},
		        {"1597","Gabriela","Salazar","2","9.2","Editar"},
		        {"7531","Oscar","Ibarra","1","8.8","Editar"},

		        {"8642","Alejandra","Campos","6","9.5","Editar"},
		        {"9753","Alberto","Vega","3","7.6","Editar"},
		        {"1864","Monica","Carrillo","4","8.9","Editar"},
		        {"2975","Raul","Suarez","2","8.2","Editar"},
		        {"3086","Patricia","Figueroa","5","9.4","Editar"},
		        {"4197","Ivan","Contreras","1","7.5","Editar"},
		        {"5208","Veronica","Escobar","6","9.6","Editar"},
		        {"6319","Roberto","Luna","3","8.7","Editar"},
		        {"7420","Adriana","Acosta","4","9.3","Editar"},
		        {"8531","Francisco","Molina","2","8.4","Editar"},

		        {"9642","Isabel","Valdez","5","9.8","Editar"},
		        {"1753","Tomas","Rangel","1","7.9","Editar"},
		        {"2864","Claudia","Peña","6","9.1","Editar"},
		        {"3975","Javier","Cervantes","3","8.5","Editar"},
		        {"4086","Lorena","Aguilar","4","9.0","Editar"},
		        {"5197","Esteban","Mejia","2","7.8","Editar"},
		        {"6208","Renata","Padilla","5","9.7","Editar"},
		        {"7319","Guillermo","Fuentes","1","8.3","Editar"},
		        {"8420","Daniela","Solis","6","9.2","Editar"},
		        {"9531","Armando","Galvan","3","8.6","Editar"},

		        {"1642","Melissa","Rosales","4","9.4","Editar"},
		        {"2753","Bruno","Miranda","2","7.7","Editar"},
		        {"3864","Ariana","Villanueva","5","9.9","Editar"},
		        {"4975","Cristian","Lozano","1","8.1","Editar"},
		        {"5086","Sandra","Beltran","6","9.3","Editar"},
		        {"6197","Kevin","Zamora","3","8.2","Editar"},
		        {"7208","Lilia","Montoya","4","9.6","Editar"},
		        {"8319","Marco","Nieto","2","7.9","Editar"},
		        {"9420","Andrea","Bravo","5","9.5","Editar"},
		        {"10531","Julio","Cortes","1","8.4","Editar"}
		};

		JTable users_table = new JTable(table_content, table_head);

		JScrollPane scroll = new JScrollPane(users_table);
		scroll.setBounds(30,170,800,300);
		users.add(scroll);
		
		users.repaint();
		
		
		
		
		
	}
	
	public void test() {
		JPanel test_panel = new JPanel();
		test_panel.setSize(400, 500);
		test_panel.setLocation(350, 50);
		test_panel.setBackground(Color.decode("#FCE4EC"));
		test_panel.setLayout(new BorderLayout(0,0));
		test_panel.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(Color.decode("#ECA8F0"), 4, true),
                        BorderFactory.createEmptyBorder(20,20,20,20)
                )
        );
		this.add(test_panel);
		
		JPanel north_panel = new JPanel();
		north_panel.setBackground(Color.decode("#FCE4EC"));
		north_panel.setLayout(new BorderLayout());
		
		JLabel users_title = new JLabel("100.0"); 
		users_title.setFont(new Font("Segoe UI", Font.BOLD,38));
		users_title.setHorizontalAlignment(JLabel.RIGHT);
		users_title.setOpaque(true);
		users_title.setBackground(Color.WHITE);
		users_title.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		north_panel.add(users_title,BorderLayout.NORTH);
		
		
		JPanel south_panel = new JPanel();  
		south_panel.setBackground(Color.decode("#F8BBD0"));
		south_panel.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
		
		//south_panel.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		Font fuente = new Font("Arial", Font.BOLD, 14);
		JButton b1 = new JButton("MC");
		b1.setFont(fuente);
		JButton b2 = new JButton("M+");
		b2.setFont(fuente);
		JButton b3 = new JButton("M-");
		b3.setFont(fuente);
		JButton b4 = new JButton("√");
		b4.setFont(fuente);
		JButton b5 = new JButton("%");
		b5.setFont(fuente);
		south_panel.add(b1);
		south_panel.add(b2);
		south_panel.add(b3);
		south_panel.add(b4);
		south_panel.add(b5);
		north_panel.add(south_panel,BorderLayout.SOUTH);
		test_panel.add(north_panel, BorderLayout.NORTH);
		
		
		JPanel center_panel = new JPanel(); 
		center_panel.setBackground(Color.decode("#F8BBD0"));
		center_panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		center_panel.setLayout(new GridLayout(4,3,10,10));
		
		center_panel.add(new JButton("7"));
		center_panel.add(new JButton("8"));
		center_panel.add(new JButton("9"));
		center_panel.add(new JButton("4"));
		center_panel.add(new JButton("5"));
		center_panel.add(new JButton("6"));
		center_panel.add(new JButton("1"));
		center_panel.add(new JButton("2"));
		center_panel.add(new JButton("3"));
		center_panel.add(new JButton("0"));
		center_panel.add(new JButton("."));
		center_panel.add(new JButton("= "));
		
		test_panel.add(center_panel,BorderLayout.CENTER);
		
		JPanel east_panel = new JPanel(); 
		east_panel.setBackground(Color.decode("#F8BBD0"));
		east_panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		east_panel.setLayout(new GridLayout(4,0,10,10));
		
		east_panel.add(new JButton("*"));
		east_panel.add(new JButton("/"));
		east_panel.add(new JButton("-"));
		east_panel.add(new JButton("+"));
		test_panel.add(east_panel,BorderLayout.EAST);
	
	}	
	
	
	public void interes() 
	{
		JPanel calculadora = new JPanel();
		calculadora.setSize(320,420);
		calculadora.setLocation(330,80);
		calculadora.setBackground(new Color(230,230,230));
		calculadora.setLayout(new BorderLayout(50,50));
		this.add(calculadora);
		
		JLabel title = new JLabel("INTERES");
		title.setFont(new Font("Arial",Font.BOLD,28));
		title.setBackground(new Color(230,230,230));
		calculadora.add(title,BorderLayout.NORTH);
		
		// panel botones
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(0,2));
		botones.setBackground(new Color(230,230,230));

		// fila 1
		botones.add(new JLabel("capital"));
		botones.add(new JTextField());
		botones.add(new JLabel("tiempo"));
		botones.add(new JTextField());
		botones.add(new JLabel("tasa interes"));
		botones.add(new JTextField());
		botones.add(new JButton("calcular"));
		botones.add(new JButton("cancelar"));

		calculadora.add(botones,BorderLayout.CENTER);
		
		JPanel inferior = new JPanel();
		inferior.setLayout(new GridLayout(0,2));
		inferior.setBackground(new Color(230,230,230));

		// fila 1
		inferior.add(new JLabel("Interes:"));
		inferior.add(new JTextField());
		inferior.add(new JLabel("Monto:"));
		inferior.add(new JTextField());
		
		calculadora.add(inferior,BorderLayout.SOUTH);
	}
	
	public void pintar() {
		JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;
                g2d.drawLine(0,0,100,100); //dibuja lineas
                
                g2d.setColor(Color.red);//Da color
                g2d.setStroke(new BasicStroke(3));//Da el grosor de la linea
                
                g2d.drawLine(200, 200, 500, 200);
                
                g2d.drawRect(250, 250, 100, 100);
                
                g2d.setColor(Color.green);
                g2d.drawOval(400,100,50,90);
                g2d.setStroke(new BasicStroke(5));
                
                g2d.setColor(Color.orange);
                g2d.fillOval(400,200,50,90);//figura rellenada
               
                g2d.setColor(Color.green);
                g2d.drawArc(300, 100, 100, 100, 90, 90);
                
                g2d.setColor(Color.orange);
                g2d.fillArc(300,300,100,100,0,300);//figura rellenada
                
                
                g2d.setColor(Color.green);
                //200,100,300
                //100,300,500
                g2d.drawPolygon(new int[] {200,100,300},new int[] {100,300,500},3);
                
                g2d.setColor(Color.orange);
                g2d.fillPolygon(new int[] {400,300,500},new int[] {200,400,500},3);
                
                g2d.setColor(Color.orange);
                g2d.fillRect(500,300,100,100);//figura rellenada
                
                try {
                	 BufferedImage image = ImageIO.read(new File("src/img/logoMj.png"));
                	 g2d.drawImage(image, 500, 30, null);
                	
                } catch(IOException e) {
                	e.printStackTrace();
                	
                }
               
                
            }
        };
        
        pane.setSize(1200,700);
        pane.setLocation(0,0);
        this.add(pane);
	}
	public void casa() {
		JPanel pane1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;
                
                g2d.setColor(Color.decode("#87CEEB"));
                g2d.fillRect(0, 0, 1200, 800);
                
                //NUBES
                g2d.setColor(Color.WHITE);	
                g2d.fillOval(200,120,80,60);
                g2d.fillOval(240,100,90,70);
                g2d.fillOval(290,120,80,60);
                g2d.fillOval(250,130,100,60);

                g2d.fillOval(900,120,80,60);
                g2d.fillOval(940,100,90,70);
                g2d.fillOval(990,120,80,60);
                g2d.fillOval(950,130,100,60);
                
          
                g2d.setColor(Color.decode("#FFD54F"));
                g2d.fillOval(45,45,110,110);
                g2d.setColor(Color.decode("#FFA000"));
                g2d.fillOval(50,50,100,100);
                
                
                g2d.setColor(Color.YELLOW);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawLine(100,50,100,20);       
                g2d.drawLine(100,150,100,180);
                g2d.drawLine(50,100,20,100);
                g2d.drawLine(150,100,180,100);
                g2d.drawLine(65,65,40,40);
                g2d.drawLine(130,65,160,40);
                g2d.drawLine(65,135,40,160);
                g2d.drawLine(135,135,160,160);
                
                g2d.setColor(Color.decode("#4CAF50"));
                g2d.fillRect(0, 500, 1200, 200);
                
                g2d.setColor(Color.decode("#6D4C41"));
                g2d.fillRect(0, 700, 1200, 200);
                
                //CERCO
                g2d.setColor(Color.decode("#A47148"));
                g2d.fillRect(0,490,1200,50);
                
                g2d.fillRect(20,440,40,160);
                g2d.fillRect(80,440,40,160);
                g2d.fillRect(140,440,40,160);
                g2d.fillRect(200,440,40,160);
                g2d.fillRect(260,440,40,160);
                g2d.fillRect(320,440,40,160);
                g2d.fillRect(380,440,40,160);
                g2d.fillRect(440,440,40,160);
                g2d.fillRect(500,440,40,160);
                g2d.fillRect(560,440,40,160);
                g2d.fillRect(620,440,40,160);
                g2d.fillRect(680,440,40,160);
                g2d.fillRect(740,440,40,160);
                g2d.fillRect(800,440,40,160);
                g2d.fillRect(860,440,40,160);
                g2d.fillRect(920,440,40,160);
                g2d.fillRect(980,440,40,160);
                g2d.fillRect(1040,440,40,160);
                g2d.fillRect(1100,440,40,160);
                g2d.fillRect(1160,440,40,160);
                
                g2d.fillPolygon(new int [] {20,40,60},new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {80,100,120},new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {140,160,180},new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {200,220,240}, new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {260,280,300}, new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {320,340,360}, new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {380,400,420}, new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {440,460,480}, new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {500,520,540}, new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {560,580,600}, new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {620,640,660}, new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {680,700,720}, new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {740,760,780}, new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {800,820,840}, new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {860,880,900}, new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {920,940,960}, new int [] {440,410,440},3);;
                g2d.fillPolygon(new int [] {980,1000,1020},new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {1040,1060,1080},new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {1100,1120,1140},new int [] {440,410,440},3);
                g2d.fillPolygon(new int [] {1160,1180,1200},new int [] {440,410,440},3);
                
                
                g2d.setColor(Color.decode("#5D4037"));               
                g2d.drawRect(20,440,40,160);
                g2d.drawRect(80,440,40,160);
                g2d.drawRect(140,440,40,160);
                g2d.drawRect(200,440,40,160);
                g2d.drawRect(260,440,40,160);
                g2d.drawRect(320,440,40,160);
                g2d.drawRect(380,440,40,160);
                g2d.drawRect(440,440,40,160);
                g2d.drawRect(500,440,40,160);
                g2d.drawRect(560,440,40,160);
                g2d.drawRect(620,440,40,160);
                g2d.drawRect(680,440,40,160);
                g2d.drawRect(740,440,40,160);
                g2d.drawRect(800,440,40,160);
                g2d.drawRect(860,440,40,160);
                g2d.drawRect(920,440,40,160);
                g2d.drawRect(980,440,40,160);
                g2d.drawRect(1040,440,40,160);
                g2d.drawRect(1100,440,40,160);
                g2d.drawRect(1160,440,40,160);
                
                g2d.drawPolygon(new int [] {20,40,60},new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {80,100,120},new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {140,160,180},new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {200,220,240}, new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {260,280,300}, new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {320,340,360}, new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {380,400,420}, new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {440,460,480}, new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {500,520,540}, new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {560,580,600}, new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {620,640,660}, new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {680,700,720}, new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {740,760,780}, new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {800,820,840}, new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {860,880,900}, new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {920,940,960}, new int [] {440,410,440},3);;
                g2d.drawPolygon(new int [] {980,1000,1020},new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {1040,1060,1080},new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {1100,1120,1140},new int [] {440,410,440},3);
                g2d.drawPolygon(new int [] {1160,1180,1200},new int [] {440,410,440},3);
                
                
                //CASA
                g2d.setColor(Color.decode("#A63A2B"));
                g2d.fillRect(400, 300, 400, 300);
       
                g2d.setColor(Color.decode("#6D6D6D"));
                g2d.fillRect(350, 600, 500, 50);
                g2d.setColor(Color.decode("#7A2E1C"));
                g2d.setStroke(new BasicStroke(2));
                g2d.drawLine(402,340,798,340);
                g2d.drawLine(402,380,798,380);
                g2d.drawLine(402,420,798,420);
                g2d.drawLine(402,460,798,460);
                g2d.drawLine(402,500,798,500);
                g2d.drawLine(402,540,798,540);
                g2d.drawLine(402,580,798,580);
            
                
                g2d.drawLine(450,300,450,340);
                g2d.drawLine(550,300,550,340);
                g2d.drawLine(650,300,650,340);
                g2d.drawLine(750,300,750,340);
                g2d.drawLine(402,340,402,380);
                g2d.drawLine(500,340,500,380);
                g2d.drawLine(600,340,600,380);
                g2d.drawLine(700,340,700,380);
                g2d.drawLine(798,340,798,380);
                g2d.drawLine(450,380,450,420);
                g2d.drawLine(550,380,550,420);
                g2d.drawLine(650,380,650,420);
                g2d.drawLine(750,380,750,420);
                g2d.drawLine(402,420,402,460);
                g2d.drawLine(500,420,500,460);
                g2d.drawLine(600,420,600,460);
                g2d.drawLine(700,420,700,460);
                g2d.drawLine(798,420,798,460);
                g2d.drawLine(450,460,450,500);
                g2d.drawLine(550,460,550,500);
                g2d.drawLine(650,460,650,500);
                g2d.drawLine(750,460,750,500);
                g2d.drawLine(402,500,402,540);
                g2d.drawLine(500,500,500,540);
                g2d.drawLine(600,500,600,540);
                g2d.drawLine(700,500,700,540);
                g2d.drawLine(798,500,798,540);
                g2d.drawLine(450,540,450,580);
                g2d.drawLine(550,540,550,580);
                g2d.drawLine(650,540,650,580);
                g2d.drawLine(750,540,750,580);
                
                
               
                //PUERTA
                g2d.setColor(Color.decode("#6D4C41"));
                g2d.fillRect(430, 350, 130, 250);
                g2d.setColor(Color.decode("#3E2723"));
                g2d.setStroke(new BasicStroke(5));
                g2d.drawRect(430, 350, 130, 250);
                g2d.setColor(Color.decode("#D4AF37"));
                g2d.fillOval(530, 470, 15, 15);
                
                //VENTANA
                g2d.setColor(Color.decode("#B3E5FC"));
                g2d.fillRect(650,350,100,100);
                g2d.setColor(Color.decode("#5D4037"));
                g2d.setStroke(new BasicStroke(5));
                g2d.drawRect(650, 350, 100, 100);
                g2d.setColor(Color.decode("#5D4037"));
                g2d.drawLine(700, 350, 700, 450);
                g2d.drawLine(650, 400, 750, 400);
                g2d.setColor(Color.decode("#B0BEC5"));
                g2d.fillRect(640,450,120,12);
                
                //CHIMENEA
                g2d.setColor(Color.decode("#8D6E63"));
                g2d.fillRect(700, 100, 100, 150);
                g2d.setColor(Color.decode("#5D4037"));
                g2d.fillRect(650, 40, 200, 60);
                g2d.setColor(Color.decode("#4E342E"));
                g2d.fillPolygon(new int [] {700,800,800},new int [] {100,100,150},3);
                
                
                //TECHO
                g2d.setColor(Color.decode("#7B1F1F"));
                g2d.fillPolygon(new int [] {550,300,950},new int [] {50,300,300},3);
           
                 
               
                
            }
        };
        
        pane1.setSize(1200,1200);
        pane1.setLocation(0,0);
        this.add(pane1);
	}
	public void mario() {
		JPanel pane1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;
                
                g2d.setColor(new Color(147, 204, 234));
                g2d.fillRect(0, 0, 1200, 800);
                
                g2d.setColor(Color.WHITE);
                g2d.setFont(new Font("Arial", Font.BOLD, 30));
                g2d.drawString("MARIO 000000", 30, 50);
                g2d.drawString("COINS x00", 1000, 50);
                
                //NUBE
                g2d.setColor(Color.WHITE);	
                g2d.fillOval(725,60,90,70);
                g2d.fillOval(780,10,100,90);
                g2d.fillOval(840,60,90,70);
                g2d.fillOval(770,90,70,60);
                g2d.fillOval(820,90,70,60);

                // OJOS
                g2d.setColor(Color.BLACK);
                g2d.fillOval(815,70,10,18); 
                g2d.fillOval(835,70,10,18);

                // LINEAS
                g2d.setColor(Color.BLACK);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawArc(725,60,90,70, 80, 190);
                g2d.drawArc(780,10,100,90, -5, 190);
                g2d.drawArc(840,60,90,70, 275, 180);
                g2d.drawArc(770,90,70,60, 200, 110);
                g2d.drawArc(820,90,70,60, 225, 110);
                
                //PISO
                g2d.setColor(Color.decode("#E9906E"));
                g2d.fillRect(0,600,1200,200);
                g2d.setColor(Color.red);
                g2d.fillRect(0,550,1200,50);
                
                g2d.setColor(Color.black);
                g2d.setStroke(new BasicStroke(3));
                g2d.drawLine(0,600,1200,600);
                g2d.drawLine(0,633,1200,633);
                g2d.drawLine(0,667,1200,667);
                g2d.drawLine(0,701,1200,701);
                g2d.drawLine(0,734,1200,734);
                g2d.drawLine(0,767,1200,767);
                g2d.drawLine(0,800,1200,800);
                
                g2d.drawLine(50,602,50,800);
                g2d.drawLine(100,602,100,800);
                g2d.drawLine(150,602,150,800);
                g2d.drawLine(200,602,200,800);
                g2d.drawLine(250,602,250,800);
                g2d.drawLine(300,602,300,800);
                g2d.drawLine(350,602,350,800);
                g2d.drawLine(400,602,400,800);
                g2d.drawLine(450,602,450,800);
                g2d.drawLine(500,602,500,800);
                g2d.drawLine(550,602,550,800);
                g2d.drawLine(600,602,600,800);
                g2d.drawLine(650,602,650,800);
                g2d.drawLine(700,602,700,800);
                g2d.drawLine(750,602,750,800);
                g2d.drawLine(800,602,800,800);
                g2d.drawLine(850,602,850,800);
                g2d.drawLine(900,602,900,800);
                g2d.drawLine(950,602,950,800);
                g2d.drawLine(1000,602,1000,800);
                g2d.drawLine(1050,602,1050,800);
                g2d.drawLine(1100,602,1100,800);
                g2d.drawLine(1150,602,1150,800);
                
               
                
                //BLOQUE1
                g2d.setColor(new Color(222, 161, 133));
                g2d.fillRect(50,200, 100, 100);
                g2d.setColor(Color.black);
                g2d.setStroke(new BasicStroke(3));
                g2d.drawRect(50,200, 100, 100);
                //TORNILLOS
                g2d.setColor(Color.BLACK);
                g2d.fillOval(55,205,14,14); 
                g2d.fillOval(131,205,14,14);
                g2d.fillOval(55,281,14,14); 
                g2d.fillOval(131,281,14,14);
                g2d.setColor(new Color(180, 180, 180)); 
                g2d.fillOval(57,207,10,10); 
                g2d.fillOval(133,207,10,10);
                g2d.fillOval(57,283,10,10); 
                g2d.fillOval(133,283,10,10);
               
                
                //BLOQUESDOBLES
                g2d.setColor(new Color(222, 161, 133));
                g2d.fillRect(250,20, 100, 100);
                g2d.fillRect(355,20, 100, 100);
                g2d.setColor(Color.black);
                g2d.setStroke(new BasicStroke(5));
                g2d.drawRect(250,20, 100, 100);
                g2d.drawRect(355,20, 100, 100);
                //TORNILLOS
                g2d.setColor(Color.BLACK);
                g2d.fillOval(255,25,14,14); 
                g2d.fillOval(331,25,14,14);
                g2d.fillOval(255,101,14,14);
                g2d.fillOval(331,101,14,14);
                g2d.setColor(new Color(180, 180, 180));
                g2d.fillOval(257,27,10,10); 
                g2d.fillOval(333,27,10,10);
                g2d.fillOval(257,103,10,10); 
                g2d.fillOval(333,103,10,10);	               
                g2d.setColor(Color.BLACK);
                g2d.fillOval(360,25,14,14); 
                g2d.fillOval(436,25,14,14);
                g2d.fillOval(360,101,14,14); 
                g2d.fillOval(436,101,14,14);
                g2d.setColor(new Color(180, 180, 180));
                g2d.fillOval(362,27,10,10); 
                g2d.fillOval(438,27,10,10);
                g2d.fillOval(362,103,10,10); 
                g2d.fillOval(438,103,10,10);
               
                
                //BLOQUE3
                g2d.setColor(new Color(255, 170, 0));
                g2d.fillRect(1000,60, 100, 100);
                g2d.setColor(Color.black);
                g2d.setStroke(new BasicStroke(3));
                g2d.drawRect(1000,60, 100, 100);
                //SIGNO
                g2d.setFont(new Font("Arial", Font.BOLD, 60));
                g2d.drawString("?", 1035,130);
                //TORNILLOS
                g2d.setColor(Color.BLACK);
                g2d.fillOval(1005,65,14,14); 
                g2d.fillOval(1081,65,14,14);
                g2d.fillOval(1005,141,14,14); 
                g2d.fillOval(1081,141,14,14);
                g2d.setColor(new Color(180, 180, 180));
                g2d.fillOval(1007,67,10,10); 
                g2d.fillOval(1083,67,10,10);
                g2d.fillOval(1007,143,10,10); 
                g2d.fillOval(1083,143,10,10);
                
                
                
                //BLOQUESGRANDESDOBLES
                g2d.setColor(new Color(100, 160, 220));
                g2d.fillRect(340,200, 220, 350);
                g2d.setColor(Color.black);
                g2d.setStroke(new BasicStroke(3));
                g2d.fillRect(560,220, 30, 330);
                g2d.drawRect(340,200, 220, 350);
                //TORNILLOS
                g2d.setColor(Color.BLACK);
                g2d.fillOval(350, 210, 14, 14); 
                g2d.fillOval(536, 210, 14, 14);
                g2d.fillOval(350, 526, 14, 14); 
                g2d.fillOval(536, 526, 14, 14);
                g2d.setColor(new Color(180, 180, 180));
                g2d.fillOval(352, 212, 10, 10); 
                g2d.fillOval(538, 212, 10, 10);
                g2d.fillOval(352, 528, 10, 10); 
                g2d.fillOval(538, 528, 10, 10);
                
                g2d.setColor(Color.pink);
                g2d.fillRect(200,300, 250, 250);
                g2d.setColor(Color.black);
                g2d.setStroke(new BasicStroke(3));
                g2d.fillRect(450,320, 30, 230);
                g2d.drawRect(200,300, 250, 250);
                //TORNILLOS
                g2d.setColor(Color.BLACK);
                g2d.fillOval(210, 310, 14, 14); 
                g2d.fillOval(426, 310, 14, 14);
                g2d.fillOval(210, 526, 14, 14); 
                g2d.fillOval(426, 526, 14, 14);
                g2d.setColor(new Color(180, 180, 180));
                g2d.fillOval(212, 312, 10, 10); 
                g2d.fillOval(428, 312, 10, 10);
                g2d.fillOval(212, 528, 10, 10); 
                g2d.fillOval(428, 528, 10, 10);
                
                
                //BLOQUEGRANDE
                g2d.setColor(Color.black);
                g2d.fillRect(1170, 320, 30, 230);
                g2d.setColor(new Color(0, 200, 100));
                g2d.fillRect(950,300, 250, 250);
                g2d.setColor(Color.black);
                g2d.setStroke(new BasicStroke(3));
                g2d.drawRect(950,300, 250, 250);
                g2d.setColor(Color.BLACK);
                g2d.fillOval(960, 310, 14, 14); 
                g2d.fillOval(1176, 310, 14, 14);
                g2d.fillOval(960, 526, 14, 14); 
                g2d.fillOval(1176, 526, 14, 14);
                g2d.setColor(new Color(180, 180, 180));
                g2d.fillOval(962, 312, 10, 10); 
                g2d.fillOval(1178, 312, 10, 10);
                g2d.fillOval(962, 528, 10, 10); 
                g2d.fillOval(1178, 528, 10, 10);
                
                try {
               	 BufferedImage image = ImageIO.read(new File("src/img/MARIO.png"));
               	 g2d.drawImage(image, 460, 380, null);
               	
               } catch(IOException e) {
               	e.printStackTrace();
               	
               }
                try {
                	BufferedImage image = ImageIO.read(new File("src/img/PLANTA.png"));
                	g2d.drawImage(image, 700, 170, null);
                	
                } catch(IOException e) {
                	e.printStackTrace();
                	
                }
                
                
                //ARBUSTO
                g2d.setColor(new Color(0, 150, 0)); 
                g2d.fillOval(70, 510, 50, 45);       
                g2d.fillOval(95, 485, 65, 70);  
                g2d.fillOval(135, 515, 45, 40);              
                g2d.setColor(Color.black);
                g2d.setStroke(new BasicStroke(3));              
                g2d.drawArc(70, 510, 50, 45, 60, 180);      
                g2d.drawArc(95, 485, 65, 85, 20, 140);  
                g2d.drawArc(135, 515, 45, 40, -60, 170);
            
                //TUBO
                g2d.setColor(new Color(0, 130, 0)); 
                g2d.fillRect(700, 350, 120, 200);
                g2d.fillRect(690, 300, 140, 50);

                g2d.setColor(new Color(0, 255, 0, 120)); 
                g2d.fillRect(725, 300, 15, 248);
                g2d.fillRect(710, 300, 10, 248);
                g2d.fillRect(750, 300, 5, 248);
                g2d.fillRect(780, 300, 5, 248);
                g2d.setColor(new Color(0, 60, 0, 150));
                g2d.fillRect(790, 300, 15, 248);
                g2d.fillRect(810, 300, 5, 248);
                 
                g2d.setColor(Color.black);
                g2d.setStroke(new BasicStroke(3));
                g2d.drawRect(700, 350, 120, 200);
                g2d.drawRect (690, 300, 140, 50);
    
                 
               
                
            }
        };
        
        pane1.setSize(1200,800);
        pane1.setLocation(0,0);
        this.add(pane1);
	}
	
}


