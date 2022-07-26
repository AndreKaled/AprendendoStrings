package InterfacesDoAndre;

import javax.swing.JFrame;

public class TesteBarraRolagem {

	public static void main(String[] args) {
		BarraRolagem barra = new BarraRolagem();
		
		barra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		barra.setSize(375,210);
		barra.setVisible(true);
	}

}
