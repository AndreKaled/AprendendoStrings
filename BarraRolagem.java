package InterfacesDoAndre;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class BarraRolagem extends JFrame {
	//variaveis de instancia
	private JScrollBar scrollBar;
	private JLabel lblcentimetros, lblpolegadas;
	
	//construindo a interface
	public BarraRolagem(){
		//invocando construtor da superclasse
		super("Exemplo de barra de rolagem");
		setLayout(null);
		
		//instanciação dos componentes
		scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0,5,0,105);
		lblcentimetros = new JLabel("0.00 Centímetros", JLabel.CENTER);
		lblpolegadas = new JLabel("0.00 Polegadas", JLabel.CENTER);
		scrollBar.setBounds(25, 20, 180, 25);
		lblcentimetros.setBounds(35,50,150,25);
		lblpolegadas.setBounds(35,80,150,25);
		
		//adicionando componentes
		add(scrollBar);
		add(lblcentimetros);
		add(lblpolegadas);
		
	}
}
