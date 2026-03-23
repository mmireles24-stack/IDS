package Main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JCheckBox;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Examenfactura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examenfactura frame = new Examenfactura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Examenfactura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JPanel barra = new JPanel();
		barra.setBounds(0, 0, 700, 60);
		barra.setBackground(new Color(0, 102, 153));
		barra.setLayout(null);
		contentPane.add(barra);

		JLabel titulo = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		titulo.setForeground(Color.WHITE);
		titulo.setBounds(20, 10, 500, 20);
		titulo.setFont(new Font("Arial", Font.BOLD, 16));
		barra.add(titulo);

		JLabel subtitulo = new JLabel("(Sin Base de datos)");
		subtitulo.setForeground(Color.WHITE);
		subtitulo.setBounds(20, 30, 200, 20);
		subtitulo.setFont(new Font("Arial", Font.PLAIN, 13));
		barra.add(subtitulo);

		
		JPanel panelCliente = new JPanel();
		panelCliente.setBounds(20, 70, 640, 80);
		panelCliente.setLayout(null);
		panelCliente.setBorder(new LineBorder(Color.GRAY));
		contentPane.add(panelCliente);

		
		JLabel lblTituloCliente = new JLabel("Datos del cliente");
		lblTituloCliente.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblTituloCliente.setForeground(new Color(85,110,95));
		lblTituloCliente.setHorizontalAlignment(SwingConstants.LEFT);
		lblTituloCliente.setVerticalAlignment(SwingConstants.TOP);
		lblTituloCliente.setBounds(10, 0, 200, 20);
		panelCliente.add(lblTituloCliente);

		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblDocumento.setForeground(new Color(85,110,95));
		lblDocumento.setBounds(10, 30, 80, 20);
		panelCliente.add(lblDocumento);

		JTextField txtDocumento = new JTextField();
		txtDocumento.setBounds(90, 30, 120, 20);
		panelCliente.add(txtDocumento);

		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNombres.setForeground(new Color(85,110,95));
		lblNombres.setBounds(230, 30, 80, 20);
		panelCliente.add(lblNombres);

		JTextField txtNombres = new JTextField();
		txtNombres.setBounds(300, 30, 120, 20);
		panelCliente.add(txtNombres);

		
		JLabel lblDireccion = new JLabel("Dirección:");
		lblDireccion.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblDireccion.setForeground(new Color(85,110,95));
		lblDireccion.setBounds(10, 55, 80, 20);
		panelCliente.add(lblDireccion);

		JTextField txtDireccion = new JTextField();
		txtDireccion.setBounds(90, 55, 120, 20);
		panelCliente.add(txtDireccion);

		
		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblTelefono.setForeground(new Color(85,110,95));
		lblTelefono.setBounds(230, 55, 80, 20);
		panelCliente.add(lblTelefono);

		JTextField txtTelefono = new JTextField();
		txtTelefono.setBounds(300, 55, 120, 20);
		panelCliente.add(txtTelefono);
		
		
		JPanel panelFactura = new JPanel();
		panelFactura.setBounds(20, 160, 640, 60);
		panelFactura.setLayout(null);
		panelFactura.setBorder(new LineBorder(Color.GRAY));
		contentPane.add(panelFactura);

		
		JLabel lblTituloFactura = new JLabel("Datos de factura");
		lblTituloFactura.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblTituloFactura.setForeground(new Color(85,110,95));
		lblTituloFactura.setHorizontalAlignment(SwingConstants.LEFT);
		lblTituloFactura.setVerticalAlignment(SwingConstants.TOP);
		lblTituloFactura.setBounds(10, 0, 200, 20);
		panelFactura.add(lblTituloFactura);

		
		JLabel lblNoFactura = new JLabel("No Factura:");
		lblNoFactura.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNoFactura.setForeground(new Color(85,110,95));
		lblNoFactura.setBounds(10, 30, 80, 20);
		panelFactura.add(lblNoFactura);

		JTextField txtNoFactura = new JTextField();
		txtNoFactura.setBounds(90, 30, 120, 20);
		panelFactura.add(txtNoFactura);

		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblFecha.setForeground(new Color(85,110,95));
		lblFecha.setBounds(230, 30, 80, 20);
		panelFactura.add(lblFecha);

		JTextField txtFecha = new JTextField();
		txtFecha.setBounds(300, 30, 120, 20);
		panelFactura.add(txtFecha);

		
		JButton btnVer = new JButton("Ver listado de facturas");
		btnVer.setBounds(20, 230, 200, 25);
		btnVer.setIcon(new ImageIcon("src/img/lista.png")); 
		btnVer.setHorizontalAlignment(SwingConstants.LEFT);
		
		btnVer.setBorderPainted(false);
		btnVer.setContentAreaFilled(false);
		btnVer.setFocusPainted(false);
		btnVer.setOpaque(false);
		
		contentPane.add(btnVer);
		
		JButton btnAdd = new JButton("Añadir");
		btnAdd.setBounds(440, 230, 100, 25);
		btnAdd.setIcon(new ImageIcon("src/img/anadir.png")); 
		btnAdd.setHorizontalAlignment(SwingConstants.LEFT);
		
		btnAdd.setBorderPainted(false);
		btnAdd.setContentAreaFilled(false);
		btnAdd.setFocusPainted(false);
		btnAdd.setOpaque(false);
		contentPane.add(btnAdd);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(540, 230, 100, 25);
		btnEliminar.setIcon(new ImageIcon("src/img/eliminar.png")); 
		btnEliminar.setHorizontalAlignment(SwingConstants.LEFT);
				
		btnEliminar.setBorderPainted(false);
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setFocusPainted(false);
		btnEliminar.setOpaque(false);
		contentPane.add(btnEliminar);

		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(20, 260, 640, 120);
		contentPane.add(scroll);

		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
					 {"Agua", "2", "500", "1000.0"},
				     {"Cereal", "5", "1000", "5000.0"},
					 {"Leche", "2", "300", "600.0"}
				},
				new String[] { "Producto", "Cantidad", "Valor", "Total" }
		));
		scroll.setViewportView(table);

		
		JLabel label = new JLabel("SubTotal:");
		label.setBounds(30, 390, 80, 20);
		contentPane.add(label);
		JLabel lblValorSubTotal = new JLabel("6600.0");
		lblValorSubTotal.setBounds(110, 390, 100, 20);
		contentPane.add(lblValorSubTotal);

		JLabel label_1 = new JLabel("% Descuento:");
		label_1.setBounds(30, 420, 100, 20);
		contentPane.add(label_1);
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(110, 420, 50, 20);
		contentPane.add(textField_1);

		JCheckBox check = new JCheckBox();
		check.setBounds(170, 420, 20, 20);
		contentPane.add(check);

		JLabel label_2 = new JLabel("Valor descontado:");
		label_2.setBounds(210, 420, 120, 20);
		contentPane.add(label_2);
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(320, 420, 100, 25);
		contentPane.add(textField_2);

		JLabel label_3 = new JLabel("IVA 19%:");
		label_3.setBounds(30, 450, 80, 20);
		contentPane.add(label_3);
		JLabel lblValorIVA = new JLabel("1254.0");
		lblValorIVA.setBounds(110, 450, 100, 20);
		contentPane.add(lblValorIVA);

		JLabel label_4 = new JLabel("Total Factura:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_4.setBounds(30, 480, 100, 20);
		contentPane.add(label_4);
		JLabel lblValorTotal = new JLabel("7524.0");
		lblValorTotal.setBounds(110, 480, 100, 20);
		contentPane.add(lblValorTotal);

	
		JButton btnFinal = new JButton("Finalizar factura");
		btnFinal.setBounds(400, 470, 150, 25);
		contentPane.add(btnFinal);

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setBounds(560, 470, 100, 25);
		contentPane.add(btnLimpiar);
	}
}