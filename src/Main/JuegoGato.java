package Main;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

public class JuegoGato extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private JButton[][] botones = new JButton[3][3];
	private char[][] tableroLogico = new char[3][3];
	private char turno = 'X';

	private int puntajeX = 0;
	private int puntajeO = 0;

	private JLabel lblX;
	private JLabel lblO;

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

		lblX = new JLabel("X: 0");
		lblX.setForeground(new Color(255, 204, 0));
		lblX.setFont(new Font("Arial", Font.BOLD, 16));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		marcador.add(lblX);

		lblO = new JLabel("O: 0");
		lblO.setForeground(new Color(255, 0, 150));
		lblO.setFont(new Font("Arial", Font.BOLD, 16));
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		marcador.add(lblO);

		JPanel tablero = new JPanel();
		tablero.setLayout(new GridLayout(3, 3));
		tablero.setBackground(new Color(0, 0, 50));
		contentPane.add(tablero, BorderLayout.CENTER);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				JButton btn = new JButton("");
				btn.setFont(new Font("Arial", Font.BOLD, 50));
				btn.setFocusPainted(false);
				btn.setBackground(new Color(10, 10, 30));

				final int fila = i;
				final int col = j;

				btn.addActionListener(e -> jugar(btn, fila, col));

				botones[i][j] = btn;
				tablero.add(btn);
			}
		}

		JPanel panelBottom = new JPanel();
		panelBottom.setBackground(new Color(10, 10, 30));
		contentPane.add(panelBottom, BorderLayout.SOUTH);

		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.setBackground(new Color(30, 30, 60));
		reiniciar.setForeground(Color.WHITE);
		reiniciar.setFont(new Font("Arial", Font.BOLD, 14));
		reiniciar.setFocusPainted(false);

		reiniciar.addActionListener(e -> reiniciarTablero());

		panelBottom.add(reiniciar);
	}

	public void jugar(JButton btn, int fila, int col) {

		if (tableroLogico[fila][col] != '\0') return;

		tableroLogico[fila][col] = turno;
		btn.setText(String.valueOf(turno));

		if (turno == 'X') {
			btn.setForeground(new Color(255, 204, 0));
		} else {
			btn.setForeground(new Color(255, 0, 150));
		}

		if (verificarGanador()) {
			if (turno == 'X') {
				puntajeX++;
				lblX.setText("X: " + puntajeX);
			} else {
				puntajeO++;
				lblO.setText("O: " + puntajeO);
			}

			JOptionPane.showMessageDialog(this, "Ganó " + turno);
			reiniciarTablero();
			return;
		}

		if (tableroLleno()) {
			JOptionPane.showMessageDialog(this, "Empate");
			reiniciarTablero();
			return;
		}

		turno = (turno == 'X') ? 'O' : 'X';
	}

	public boolean verificarGanador() {

		for (int i = 0; i < 3; i++) {
			if (tableroLogico[i][0] == turno &&
				tableroLogico[i][1] == turno &&
				tableroLogico[i][2] == turno) return true;

			if (tableroLogico[0][i] == turno &&
				tableroLogico[1][i] == turno &&
				tableroLogico[2][i] == turno) return true;
		}

		if (tableroLogico[0][0] == turno &&
			tableroLogico[1][1] == turno &&
			tableroLogico[2][2] == turno) return true;

		if (tableroLogico[0][2] == turno &&
			tableroLogico[1][1] == turno &&
			tableroLogico[2][0] == turno) return true;

		return false;
	}

	public boolean tableroLleno() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tableroLogico[i][j] == '\0') return false;
			}
		}
		return true;
	}

	public void reiniciarTablero() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tableroLogico[i][j] = '\0';
				botones[i][j].setText("");
			}
		}
		turno = 'X';
	}
}
