package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AuthView {
	public AuthView() {
		
	}
	
	public void loginView() {
		//Creacion de ventana y ajuste de sus parametros
		JFrame ventana = new JFrame();
		
		ventana.setSize(1200, 1200);// para que tenga medidas de cuando se crea
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// al cerrar ventana no se siga ejecutando el codigo
		// this.setLocationRelativeTo(null);//ponerla en el centro
		ventana.setMinimumSize(new Dimension(200, 200));// da parametros de cuanto puede crecer o minimizar
		ventana.setMaximumSize(new Dimension(800, 800));
		ventana.setTitle("Login");
		ventana.setBackground(Color.BLACK);

		Toolkit logo_windows = Toolkit.getDefaultToolkit();
		Image icono = logo_windows.getImage("logoMJ.png");
		ventana.setIconImage(icono);
		ventana.setLayout(null);// Es para tener un marco, aqui no tenemos por el null
		ventana.setLocation(200, 200);

		
		ventana.getContentPane().removeAll(); 
		//ventana.menu();
		JPanel contenedor = new JPanel();
		contenedor.setBackground(new Color(18, 22, 38));
		contenedor.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
		contenedor.setBounds(20, 20, 1160, 610);
		contenedor.setLayout(null);
		ventana.add(contenedor);

		JLabel title_login = new JLabel();
		title_login.setText("Bienvenido");
		title_login.setSize(500, 50);
		title_login.setOpaque(false);
		title_login.setLocation(0, 40);
		// title_login.setBackground(Color.gray);
		title_login.setFont(new Font("Segoe UI", Font.BOLD, 38));// Para darle fuente al texto
		title_login.setHorizontalAlignment(JLabel.CENTER);
		title_login.setForeground(Color.WHITE);
		contenedor.add(title_login);

		JLabel usuario = new JLabel();
		usuario.setText("Usuario:");
		usuario.setSize(200, 30);
		// usuario.setOpaque(true);
		usuario.setLocation(100, 130);
		usuario.setFont(new Font("Segoe UI", Font.PLAIN, 20));// Para darle fuente al texto
		usuario.setHorizontalAlignment(JLabel.LEFT);
		usuario.setForeground(new Color(180, 190, 210));
		contenedor.add(usuario);

		JTextField username = new JTextField();
		username.setSize(300, 30);
		username.setLocation(100, 160);
		username.setBackground(new Color(30, 35, 55));
		username.setForeground(Color.WHITE);
		username.setCaretColor(new Color(0, 255, 200));
		username.setFont(new Font("Segoe UI", Font.BOLD, 22));
		username.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 200), 1));
		contenedor.add(username);

		ImageIcon iconUser = new ImageIcon("ICON USER1.PNG");
		Image imgUser = iconUser.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
		JLabel iconoUser = new JLabel(new ImageIcon(imgUser));
		iconoUser.setBounds(70, 165, 20, 20); // ajusta posición
		contenedor.add(iconoUser);

		JLabel contraseña = new JLabel();
		contraseña.setText("Contraseña:");
		contraseña.setSize(200, 30);
		// usuario.setOpaque(true);
		contraseña.setLocation(100, 220);
		contraseña.setFont(new Font("Segoe UI", Font.PLAIN, 20));// Para darle fuente al texto
		contraseña.setHorizontalAlignment(JLabel.LEFT);
		contraseña.setForeground(new Color(180, 190, 210));
		contenedor.add(contraseña);

		JPasswordField password = new JPasswordField();
		password.setSize(300, 30);
		password.setLocation(100, 250);
		password.setBackground(new Color(30, 35, 55));
		password.setForeground(Color.WHITE);
		password.setCaretColor(new Color(0, 255, 200));
		password.setFont(new Font("Segoe UI", Font.BOLD, 22));
		password.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 200), 1));
		contenedor.add(password);

		ImageIcon iconLock = new ImageIcon("ICON PASSWORD.png");
		Image imgLock = iconLock.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		JLabel iconoLock = new JLabel(new ImageIcon(imgLock));
		iconoLock.setBounds(70, 255, 20, 20);
		contenedor.add(iconoLock);

		JCheckBox recordar = new JCheckBox();
		recordar.setText("Recordarme");
		recordar.setSize(150, 30);
		recordar.setLocation(100, 290);
		recordar.setBackground(new Color(18, 22, 38));
		recordar.setForeground(new Color(180, 190, 210));
		recordar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		contenedor.add(recordar);

		/*JButton olvido = new JButton();
		olvido.setText("¿Olvidó su contraseña?");
		olvido.setContentAreaFilled(false);
		olvido.setBorderPainted(false);
		olvido.setFocusPainted(false);
		olvido.setSize(200, 30);
		olvido.setLocation(250, 290);
		olvido.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		olvido.setForeground(new Color(0, 255, 200));
		olvido.addActionListener(e -> router("recovery"));
		contenedor.add(olvido);*/

		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setSize(180, 45);
		acceder.setLocation(160, 360);
		acceder.setFont(new Font("Segoe UI", Font.BOLD, 22));
		acceder.setBackground(new Color(0, 255, 200));
		acceder.setForeground(new Color(18, 22, 38));
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

				if (username_val.equals("") || username_val.contains(" ")) {
					username.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				} else {
					username.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				}

				if (password_val.length() < 6 || password_val.contains(" ")) {
					password.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				} else {
					password.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				}
				if (username_val.equals(user_correcto) && password_val.equals(pass_correcto)) {
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

		JButton registro = new JButton("¿Aún no tienes cuenta?");
		registro.setLocation(100, 460);
		registro.setSize(300, 50);
		registro.setFont(new Font("Arial", Font.BOLD, 22));
		contenedor.add(registro);

		registro.addActionListener(e -> {
			ventana.dispose();
			 showRegister();
			
			// System.out.println("Hola");
			// System.out.println(e);
			//this.router("registro");
		});

		contenedor.repaint();// refrescar la ventana una vez ejecutada
		contenedor.revalidate();
		ventana.revalidate();
		ventana.setVisible(true);
		

	}

	public void showRegister() {
		
		//Creacion de ventana y ajuste de sus parametros
		JFrame ventana = new JFrame();
		
		ventana.setSize(1200,800);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setTitle("Login");
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(1200,800));
		ventana.setBackground(Color.black);
		ventana.getContentPane().setBackground(Color.black);
		ventana.setLayout(null);
		
		JPanel register_container = new JPanel();// seria nuestra hoja
		register_container.setOpaque(true);
		register_container.setBackground(new Color(238, 242, 246));
		register_container.setSize(500, 600);
		register_container.setLocation(650, 30);
		register_container.setLayout(null);
		ventana.add(register_container);

		JLabel registro = new JLabel("Registro");
		registro.setBounds(0, 20, 500, 50);
		registro.setFont(new Font("Segoe UI", Font.BOLD, 34));
		registro.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(registro);

		// NOMBRE------
		JLabel nombre = new JLabel("Nombre de usuario:");
		nombre.setBounds(100, 85, 300, 25);
		nombre.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		register_container.add(nombre);

		JTextField username1 = new JTextField();
		username1.setBounds(100, 110, 300, 35);
		username1.setBackground(Color.WHITE);
		username1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		register_container.add(username1);

		// BIOGRAFRÍA-----
		JLabel bio_tag = new JLabel("Biografía");
		bio_tag.setBounds(0, 160, 500, 30);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setFont(new Font("Segoe UI", Font.BOLD, 20));
		register_container.add(bio_tag);

		JTextArea bio = new JTextArea();
		bio.setBounds(100, 190, 300, 70);
		bio.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		register_container.add(bio);

		// PREFERENCIAS---
		JLabel preferences = new JLabel("Preferencias");
		preferences.setBounds(0, 270, 500, 30);
		preferences.setHorizontalAlignment(JLabel.CENTER);
		preferences.setFont(new Font("Segoe UI", Font.BOLD, 20));
		register_container.add(preferences);

		JCheckBox sweet_option = new JCheckBox("Dulce");
		sweet_option.setBounds(110, 300, 90, 25);
		sweet_option.setOpaque(false);
		register_container.add(sweet_option);

		JCheckBox salty_option = new JCheckBox("Salado");
		salty_option.setBounds(210, 300, 90, 25);
		salty_option.setOpaque(false);
		register_container.add(salty_option);

		JCheckBox healthy_option = new JCheckBox("Saludable");
		healthy_option.setBounds(310, 300, 110, 25);
		healthy_option.setOpaque(false);
		// healthy_option.setBorderPainted(true);
		// healthy_option.setBorder(BorderFactory.createLineBorder(Color.white));
		register_container.add(healthy_option);

		// TÉRMINOS----
		JLabel terms_text = new JLabel("Términos");
		terms_text.setBounds(0, 330, 500, 30);
		terms_text.setHorizontalAlignment(JLabel.CENTER);
		terms_text.setFont(new Font("Segoe UI", Font.BOLD, 22));
		register_container.add(terms_text);

		JRadioButton accept_terms = new JRadioButton("Acepto terminos");
		accept_terms.setBounds(110, 360, 140, 25);
		accept_terms.setOpaque(false);
		register_container.add(accept_terms);

		JRadioButton reject_terms = new JRadioButton("Rechazo terminos");
		reject_terms.setBounds(260, 360, 160, 25);
		reject_terms.setOpaque(false);
		register_container.add(reject_terms);

		ButtonGroup terms = new ButtonGroup();
		terms.add(reject_terms);
		terms.add(accept_terms);

		String[] colonias = { "Camino Real", "La fuente", "Villas del encanto" };

		JComboBox list = new JComboBox(colonias);
		list.setBounds(100, 395, 300, 30);
		register_container.add(list);

		JButton create_account = new JButton("Crear cuenta");
		create_account.setBounds(150, 435, 200, 40);
		create_account.setFont(new Font("Segoe UI", Font.BOLD, 22));
		create_account.setBackground(new Color(25, 118, 210));
		create_account.setForeground(Color.WHITE);
		register_container.add(create_account);
		create_account.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String username1_val = username1.getText();
				String bio_val = bio.getText();

				if (username1_val.equals("") || username1_val.contains(" ")) {
					username1.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				} else {
					username1.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				}

				if (bio_val.equals("")) {
					bio.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				} else {
					bio.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				}
				if (!sweet_option.isSelected() && !salty_option.isSelected() && !healthy_option.isSelected()) {
					sweet_option.setForeground(Color.red);
					salty_option.setForeground(Color.red);
					healthy_option.setForeground(Color.red);
				} else {
					sweet_option.setForeground(Color.black);
					salty_option.setForeground(Color.black);
					healthy_option.setForeground(Color.black);
				}

				if (!accept_terms.isSelected()) {
					accept_terms.setForeground(Color.red);
				} else {
					accept_terms.setForeground(Color.black);
				}
			}

		});

		JButton cancelar = new JButton("Cancelar");
		cancelar.setLocation(150, 500);
		cancelar.setSize(200, 50);
		cancelar.setFont(new Font("Arial", Font.BOLD, 22));
		register_container.add(cancelar);

		cancelar.addActionListener(e -> {
			 ventana.dispose();
			 loginView();

			//this.router("login");
		});

		register_container.repaint();
		ventana.setVisible(true);

	}
}