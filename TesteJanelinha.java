package InterfacesDoAndre;

import javax.swing.JFrame;

public class TesteJanelinha {

	public static void main(String[] args) {
		Janelinha j = new Janelinha();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(330,210);
		j.setVisible(true);
	}

}
