package view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controllers.UsersController;
import models.User;

public class UsersView {
	
	private UsersController uc;

	public UsersView() {

	}

	public void tableUsers(ArrayList<User> data_users)
	{  

		JFrame ventana = new JFrame();
		ventana.setSize(1000, 640);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(1200,800));
		ventana.setTitle("Hola"); 
		ventana.getContentPane().setBackground(Color.decode("#C8DEBD"));
		ventana.setLayout(null);

		JPanel users = new JPanel();
		users.setSize(1000, 500);
		users.setLocation(100, 50);
		users.setBackground(Color.white);
		users.setLayout(null);
		ventana.add(users);

		JLabel users_title = new JLabel("USUARIOS");
		users_title.setBounds(400, 30, 200, 40);
		users_title.setHorizontalAlignment(JLabel.CENTER);
		users_title.setOpaque(true);
		users_title.setFont(new Font("Arial",Font.BOLD,22));
		users_title.setBackground(Color.decode("#F27A61"));
		users.add(users_title);

		JButton export = new JButton("Exportar");
		export.setBounds(30, 120, 100, 40);
		users.add(export);

		JButton add = new JButton("Añadir");
		add.addActionListener(e ->{
			
			ventana.dispose();
			addUserForm();
			
		});
		add.setBounds(130, 120, 100, 40);
		users.add(add);

		Object[] table_head = {"ID","Nombre","Apellidos","Correo","Teléfono","Acciones"};

		/*Object [][] table_content = {
		    {"20231001","Juan","Pérez García","3","8.7","Editar"},
		    {"20231002","María","López Hernández","5","9.2","Editar"},
		    {"20231003","Carlos","Ramírez Torres","2","7.9","Editar"},
		    {"20231004","Ana","Gómez Sánchez","6","9.5","Editar"},
		    {"20231001","Juan","Pérez García","3","8.7","Editar"},
		    {"20231002","María","López Hernández","5","9.2","Editar"},
		    {"20231003","Carlos","Ramírez Torres","2","7.9","Editar"},
		    {"20231004","Ana","Gómez Sánchez","6","9.5","Editar"},
		    {"20231001","Juan","Pérez García","3","8.7","Editar"},
		    {"20231002","María","López Hernández","5","9.2","Editar"},
		    {"20231003","Carlos","Ramírez Torres","2","7.9","Editar"},
		    {"20231004","Ana","Gómez Sánchez","6","9.5","Editar"},
		    {"20231001","Juan","Pérez García","3","8.7","Editar"},
		    {"20231002","María","López Hernández","5","9.2","Editar"},
		    {"20231003","Carlos","Ramírez Torres","2","7.9","Editar"},
		    {"20231004","Ana","Gómez Sánchez","6","9.5","Editar"}
		};*/
		
		DefaultTableModel model = new DefaultTableModel(table_head, 0);

		for (User user : data_users) {

	        Object[] row = { user.getId(), user.getName(), user.getLastname(), user.getEmail(), user.getPhone() };
	        model.addRow(row); 
	    }

		//JTable users_table = new JTable(table_content,table_head);
		
		JTable users_table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(users_table);

		scrollPane.setLocation(30, 180); 
		scrollPane.setSize(800, 100);


		users.add(scrollPane);

		ventana.setVisible(true);
	}
	
	public void addUserForm()
	{
		JFrame ventana = new JFrame();
		ventana.setSize(800, 640);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(1200,800));
		ventana.setTitle("Hola"); 
		ventana.getContentPane().setBackground(Color.decode("#C8DEBD"));
		ventana.setLayout(null);
		
		JPanel users = new JPanel();
		users.setSize(800, 500);
		users.setLocation(100, 50);
		users.setBackground(Color.white);
		users.setLayout(null);
		ventana.add(users);
		
		JLabel users_title = new JLabel("AÑADIR USUARIO");
		users_title.setBounds(400, 30, 200, 40);
		users_title.setHorizontalAlignment(JLabel.CENTER);
		users_title.setOpaque(true);
		users_title.setFont(new Font("Arial",Font.BOLD,22));
		users_title.setBackground(Color.decode("#F27A61"));
		users.add(users_title);
		
		JPanel nombrePanel = new JPanel(null);
	    nombrePanel.setBackground(Color.WHITE);
	    nombrePanel.setBorder(BorderFactory.createTitledBorder("Nombre completo"));
	    nombrePanel.setBounds(45, 145, 360, 75);

	    JTextField nombreField = new JTextField();
	    nombreField.setBounds(18, 28, 325, 35);
	    nombreField.setBackground(new Color(218, 230, 225));
	    nombreField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
	    nombrePanel.add(nombreField);

	    users.add(nombrePanel);
	    
	    JPanel correoPanel = new JPanel(null);
	    correoPanel.setBackground(Color.WHITE);
	    correoPanel.setBorder(BorderFactory.createTitledBorder("Correo electrónico"));
	    correoPanel.setBounds(45, 230, 360, 75);

	    JTextField correoField = new JTextField();
	    correoField.setBounds(18, 28, 325, 35);
	    correoField.setBackground(new Color(218, 230, 225));
	    correoField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
	    correoPanel.add(correoField);

	    users.add(correoPanel);
	    
	    JPanel passPanel = new JPanel(null);
	    passPanel.setBackground(Color.WHITE);
	    passPanel.setBorder(BorderFactory.createTitledBorder("Contraseña"));
	    passPanel.setBounds(45, 315, 360, 75);

	    JPasswordField passwordField = new JPasswordField();
	    passwordField.setBounds(18, 28, 290, 35);
	    passwordField.setBackground(new Color(218, 230, 225));
	    passwordField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
	    passPanel.add(passwordField);

	    JLabel iconoOjo = new JLabel();
	    iconoOjo.setBounds(318, 36, 20, 20);
	    try {
	        iconoOjo.setIcon(new ImageIcon(this.getClass().getResource("/img/hidden.png")));
	    } catch (Exception ex) {
	        iconoOjo.setText("o");
	    }
	    passPanel.add(iconoOjo);

	    users.add(passPanel);
		
		JButton export = new JButton("Cancelar");
		export.setBounds(45, 400, 100, 40);
		users.add(export);
		
		JButton add = new JButton("Guardar");
		add.setBounds(230, 400, 100, 40);
		add.addActionListener(e ->{
			boolean valido = true;
			
			String nombre = nombreField.getText().trim();
	        String correo = correoField.getText().trim();
	        String password = new String(passwordField.getPassword()).trim();
	        
	        if (nombre.isEmpty()) {
	            nombreField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
	            valido = false;
	        } else {
	            nombreField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
	        }

	        if (correo.isEmpty() || !correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
	            correoField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
	            valido = false;
	        } else {
	            correoField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
	        }

	        if (password.isEmpty() || password.length() < 5) {
	            passwordField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
	            valido = false;
	        } else {
	            passwordField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
	        }
	        
	        if(valido)
	        {
	        	
	        	uc = new UsersController();  
	        	
	        	if( uc.addUser(correo, password, nombre) )
	        	{ 
	        		JOptionPane.showMessageDialog(
		                null,
		                "Registro exitoso\n\n" +
		                "Nombre: " + nombre + "\n" +
		                "Correo: " + correo + "\n",
		                "Éxito",
		                JOptionPane.INFORMATION_MESSAGE
		            );
	        		
	        		ventana.dispose();
	        		uc.showUsers();
	        	
	        	}else {
	        		JOptionPane.showMessageDialog(
	    	                null,
	    	                "No se pudo crear la cuenta.",
	    	                "Aviso",
	    	                JOptionPane.WARNING_MESSAGE
	    	            );
	        	}
	        	
	        }else {
	        	JOptionPane.showMessageDialog(
	                null,
	                "No se pudo crear la cuenta.",
	                "Aviso",
	                JOptionPane.WARNING_MESSAGE
	            );
	        }
		});
		users.add(add);
		
		
		
		ventana.setVisible(true);
	}
}
