package Main;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JuegoGato extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				JuegoGato frame = new JuegoGato();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public JuegoGato() {
		setTitle("Juego del Gato");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);

		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(10, 10, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		
		JPanel panelTop = new JPanel();
		panelTop.setBackground(new Color(10, 10, 30));
		panelTop.setLayout(new BorderLayout());
		contentPane.add(panelTop, BorderLayout.NORTH);

		JLabel tiempo = new JLabel("0:00");
		tiempo.setForeground(Color.WHITE);
		tiempo.setFont(new Font("Arial", Font.BOLD, 18));
		tiempo.setHorizontalAlignment(SwingConstants.CENTER);
		panelTop.add(tiempo, BorderLayout.NORTH);

		JPanel marcador = new JPanel();
		marcador.setBackground(new Color(10, 10, 30));
		marcador.setLayout(new GridLayout(1, 2));
		panelTop.add(marcador, BorderLayout.CENTER);

		JLabel lblX = new JLabel("X: 0");
		lblX.setForeground(new Color(255, 204, 0));
		lblX.setFont(new Font("Arial", Font.BOLD, 16));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		marcador.add(lblX);

		JLabel lblO = new JLabel("O: 0");
		lblO.setForeground(new Color(255, 0, 150));
		lblO.setFont(new Font("Arial", Font.BOLD, 16));
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		marcador.add(lblO);

		
		JPanel tablero = new JPanel();
		tablero.setLayout(new GridLayout(3, 3, 0, 0));
		tablero.setBackground(new Color(0, 0, 50));
		contentPane.add(tablero, BorderLayout.CENTER);

	
		Color azul = new Color(0, 120, 255);
		JButton b1 = crearBoton("X", new Color(255,204,0),
		    BorderFactory.createMatteBorder(0,0,3,3,azul));

		JButton b2 = crearBoton("O", new Color(255,0,150),
		    BorderFactory.createMatteBorder(0,0,3,3,azul));

		JButton b3 = crearBoton("X", new Color(255,204,0),
		    BorderFactory.createMatteBorder(0,0,3,0,azul));

		JButton b4 = crearBoton("O", new Color(255,0,150),
		    BorderFactory.createMatteBorder(0,0,3,3,azul));

		JButton b5 = crearBoton("X", new Color(255,204,0),
		    BorderFactory.createMatteBorder(0,0,3,3,azul));

		JButton b6 = crearBoton("O", new Color(255,0,150),
		    BorderFactory.createMatteBorder(0,0,3,0,azul));

		JButton b7 = crearBoton("X", new Color(255,204,0),
		    BorderFactory.createMatteBorder(0,0,0,3,azul));

		JButton b8 = crearBoton("O", new Color(255,0,150),
		    BorderFactory.createMatteBorder(0,0,0,3,azul));

		JButton b9 = crearBoton("X", new Color(255,204,0),
		    BorderFactory.createMatteBorder(0,0,0,0,azul));

		tablero.add(b1);
		tablero.add(b2);
		tablero.add(b3);
		tablero.add(b4);
		tablero.add(b5);
		tablero.add(b6);
		tablero.add(b7);
		tablero.add(b8);
		tablero.add(b9);

		
		JPanel panelBottom = new JPanel();
		panelBottom.setBackground(new Color(10, 10, 30));
		contentPane.add(panelBottom, BorderLayout.SOUTH);

		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.setBackground(new Color(30, 30, 60));
		reiniciar.setForeground(Color.WHITE);
		reiniciar.setFont(new Font("Arial", Font.BOLD, 14));
		reiniciar.setFocusPainted(false);

		panelBottom.add(reiniciar);
	}
	
	public JButton crearBoton(String texto, Color color, Border borde) {
		JButton btn = new JButton(texto);
		btn.setFont(new Font("Arial", Font.BOLD, 50));
		btn.setFocusPainted(false);
		btn.setBackground(new Color(10, 10, 30));
		btn.setForeground(color);
		btn.setBorder(borde); 

		return btn;
	}
}
