package Main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

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
		
	}

}
