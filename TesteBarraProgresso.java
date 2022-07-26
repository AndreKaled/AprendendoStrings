package InterfacesDoAndre;

import javax.swing.JFrame;

public class TesteBarraProgresso {

	public static void main(String[] args) {
		BarraProgresso ex = new BarraProgresso();
		ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ex.setSize(375, 210);
		ex.setVisible(true);
	}
}