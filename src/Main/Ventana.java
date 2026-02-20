package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
		this.setVisible(true);//para que se vea la ventana
		this.setSize(500,500);//para que tenga medidas de cuando se crea
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//al cerrar ventana no se siga ejecutando el codigo
		//this.setLocationRelativeTo(null);//ponerla en el centro
		this.setMinimumSize(new Dimension(200,200));//da parametros de cuanto puede crecer o minimizar
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("Holis");
		this.setBackground(Color.BLACK);
		this.setLocation(200,200);
		this.setLayout(null);//Es para tener un marco, aqui no tenemos por el null
		
		JPanel contenedor = new JPanel();//seria nuestra hoja
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.pink);
		contenedor.setSize(500,500);
		contenedor.setLocation(0,0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		
		JLabel title_login = new JLabel();
		title_login.setText("Bienvenido");
		title_login.setSize(200,30);
		title_login.setOpaque(true);
		title_login.setLocation(150,10);
		title_login.setBackground(Color.gray);
		title_login.setFont(new Font("Arial",Font.BOLD,22));//Para darle fuente al texto
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JTextField username = new JTextField();
		username.setSize(300,30);
		username.setLocation(30,150);
		username.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(username);
		
		JButton acceder= new JButton();
		acceder.setText("Acceder");
		acceder.setSize(180,50);
		acceder.setLocation(150,350);
		acceder.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(acceder);
		
		
		contenedor.repaint();//refrescar la ventana una vez ejecutada 
		contenedor.revalidate();
		
		
		
		
		
	}

}
