package InterfacesDoAndre;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class BarraProgresso extends JFrame {
	// variaveis de instancia
	private JProgressBar pbInstalar;
	private JButton btnAumenta, btnDiminui;

	// construtor
	public BarraProgresso() {
		super("Exemplo de barra de progresso");
		setLayout(null);

		// instaciação dos componentes
		pbInstalar = new JProgressBar();
		pbInstalar.setBounds(50, 10, 100, 20);
		btnAumenta = new JButton("Aumentar");
		btnAumenta.setBounds(50, 50, 100, 25);
		btnAumenta.setMnemonic('A');
		btnAumenta.setToolTipText("Clique para aumentar");
		btnDiminui = new JButton("Diminuir");
		btnDiminui.setBounds(50, 100, 100, 25);
		// adicionar o componente ao JFrame
		add(pbInstalar);
		add(btnAumenta);
		add(btnDiminui);
	}
}