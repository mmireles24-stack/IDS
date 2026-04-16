package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import java.awt.Toolkit;

public class Ventana2 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JPanel Datosgenerales;
	private JPanel PerfilUsuario;
	private JPanel DatosOpcionales;
	private JPanel Botones;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JFormattedTextField frmtdtxtfldDdmmaaaa;
	private JLabel lblNewLabel_5;
	private JPanel panel_2;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblNewLabel_6;
	private JComboBox comboBox;
	private JLabel label;
	private JLabel lblNewLabel_7;
	private JPanel panel_3;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JScrollPane scrollPane_1;
	private JList list;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana2() {
	    initialize();
	    frame.pack();
	    frame.setLocationRelativeTo(null);
	}
	
	

	
	private void initialize() {
		frame = new JFrame();
		
		ImageIcon icon2 = new ImageIcon("C:\\JAVA\\IDS\\logoMJ.png");
		Image img2 = icon2.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		frame.setIconImage(img2);
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(244,241,234));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("Registro de usuarios ");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(85,110,95));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblNewLabel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(244,241,234));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 2, 10, 10));
		
		Datosgenerales = new JPanel();
		Datosgenerales.setBorder(new TitledBorder(new LineBorder(new Color(200,200,200),1,true),
		"Datos generales", TitledBorder.LEFT,TitledBorder.TOP));
		Datosgenerales.setBackground(new Color(232,227,217));
		panel_1.add(Datosgenerales);
		Datosgenerales.setLayout(new GridLayout(6, 2, 10, 10));
		
		lblNewLabel_1 = new JLabel("Nombres:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Datosgenerales.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBorder(BorderFactory.createLineBorder(new Color(200,200,200),1,true));
		Datosgenerales.add(textField);
		
		lblNewLabel_2 = new JLabel("Apellido Paterno:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Datosgenerales.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBorder(BorderFactory.createLineBorder(new Color(200,200,200),1,true));
		Datosgenerales.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Apellido Materno:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Datosgenerales.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBorder(BorderFactory.createLineBorder(new Color(200,200,200),1,true));
		Datosgenerales.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		Datosgenerales.add(lblNewLabel_4);
		
		frmtdtxtfldDdmmaaaa = new JFormattedTextField();
		frmtdtxtfldDdmmaaaa.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldDdmmaaaa.setBackground(new Color(255, 255, 255));
		frmtdtxtfldDdmmaaaa.setText("dd/mm/aaaa");
		frmtdtxtfldDdmmaaaa.setBorder(BorderFactory.createLineBorder(new Color(200,200,200),1,true));
		Datosgenerales.add(frmtdtxtfldDdmmaaaa);
		
		lblNewLabel_5 = new JLabel("Sexo:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		Datosgenerales.add(lblNewLabel_5);
		
		panel_2 = new JPanel();
		Datosgenerales.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		panel_2.setBackground(new Color(232,227,217));
		panel_2.setBorder(null);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setBackground(new Color(232,227,217));
		panel_2.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setBackground(new Color(232,227,217));
		panel_2.add(rdbtnNewRadioButton);
		
		ButtonGroup grupoSexo = new ButtonGroup();
		grupoSexo.add(rdbtnNewRadioButton_1);
		grupoSexo.add(rdbtnNewRadioButton);
		
		lblNewLabel_6 = new JLabel("Nacionalidad:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		Datosgenerales.add(lblNewLabel_6);
		
		comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"México", "Perú", "Colombia", "Argentina", "Chile"}));
		Datosgenerales.add(comboBox);
		
		PerfilUsuario = new JPanel();
		PerfilUsuario.setBackground(new Color(221,229,216));
		PerfilUsuario.setBorder(new TitledBorder(new LineBorder(new Color(200,200,200),1,true),
		"Perfil de usuario",TitledBorder.LEFT, TitledBorder.TOP));
		panel_1.add(PerfilUsuario);

		PerfilUsuario.setLayout(new BorderLayout()); 

		
		JPanel panelCentro = new JPanel();
		panelCentro.setLayout(new GridLayout(2,1,0,20));
		panelCentro.setBackground(new Color(221,229,216));
		PerfilUsuario.add(panelCentro, BorderLayout.CENTER);


		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);

		ImageIcon icon = new ImageIcon("C:\\JAVA\\IDS\\Login1.png");
		Image img = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		lblNewLabel_7.setIcon(new ImageIcon(img));
		lblNewLabel_7.setBorder(new EmptyBorder(10,0,10,0));
		panelCentro.add(lblNewLabel_7);

		
		panel_3 = new JPanel();
		panel_3.setLayout(new GridLayout(2,1,0,10));
		panel_3.setBackground(new Color(221,229,216));
		

		chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBackground(new Color(221,229,216));
		panel_3.add(chckbxNewCheckBox);

		chckbxNewCheckBox_1 = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox_1.setVerticalAlignment(SwingConstants.TOP);
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_1.setBackground(new Color(221,229,216));
		panel_3.add(chckbxNewCheckBox_1);

		panelCentro.add(panel_3);
	
		DatosOpcionales = new JPanel();
		DatosOpcionales.setBorder(new TitledBorder(new LineBorder(new Color(200,200,200),1,true),
		"Datos opcionales",TitledBorder.LEFT,TitledBorder.TOP));
		DatosOpcionales.setBackground(new Color(221,229,216));
		panel_1.add(DatosOpcionales);
		
		DatosOpcionales.setLayout(new GridLayout(0, 2, 15, 0));
		lblNewLabel_8 = new JLabel("Descripción:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		DatosOpcionales.add(lblNewLabel_8);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_9 = new JLabel("Preferencias:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		DatosOpcionales.add(lblNewLabel_9);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		DatosOpcionales.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		DatosOpcionales.add(scrollPane_1);
		
		list = new JList();
		list.setFont(new Font("Tahoma", Font.PLAIN, 14));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(list);
		
		label_1 = new JLabel("");
		DatosOpcionales.add(label_1);
		
		Botones = new JPanel();
		Botones.setBackground(new Color(236,232,223));
		panel_1.add(Botones);
		Botones.setLayout(null);
		
		btnNewButton_1 = new JButton("Nuevo");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		ImageIcon iconNuevo = new ImageIcon("C:\\JAVA\\IDS\\nuevo.png");
		Image imgNuevo = iconNuevo.getImage().getScaledInstance(22, 22, Image.SCALE_SMOOTH);
		btnNewButton_1.setIcon(new ImageIcon(imgNuevo));
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_1.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setBounds(200, 78, 150, 40);
		btnNewButton_1.setBackground(new Color(122,158,126));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(new LineBorder(new Color(122,158,126),1,true));
		btnNewButton_1.setIconTextGap(15);
		Botones.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Guardar");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		ImageIcon iconGuardar = new ImageIcon("C:\\JAVA\\IDS\\guardar.png");
		Image imgGuardar = iconGuardar.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
		btnNewButton_2.setIcon(new ImageIcon(imgGuardar));
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton_2.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton_2.setBounds(200, 150, 150, 40);
		btnNewButton_2.setBackground(new Color(122,158,126));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBorder(new LineBorder(new Color(122,158,126),1,true));
		btnNewButton_2.setIconTextGap(15);
		Botones.add(btnNewButton_2);
		
		btnNewButton = new JButton("Salir");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		ImageIcon iconSalir = new ImageIcon("C:\\JAVA\\IDS\\salir.png");
		Image imgSalir = iconSalir.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
		btnNewButton.setIcon(new ImageIcon(imgSalir));
		btnNewButton.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton.setVerticalTextPosition(SwingConstants.CENTER);
		btnNewButton.setBounds(200, 220, 150, 40);
		btnNewButton.setBackground(new Color(122,158,126));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(new LineBorder(new Color(122,158,126),1,true));
		btnNewButton.setIconTextGap(15);
		Botones.add(btnNewButton);
		
	}

}
