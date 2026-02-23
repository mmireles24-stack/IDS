package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
		this.setVisible(true);//para que se vea la ventana
		this.setSize(500,500);//para que tenga medidas de cuando se crea
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
		
		
		
		
		
	}

}
