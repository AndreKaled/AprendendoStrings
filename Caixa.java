package InterfacesDoAndre;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Caixa extends JFrame{
	//variaveis de instância
	private JLabel label1;
	private JLabel label2;
	private JTextField caixa1;
	private JTextField caixa2;
	private JButton btnCalcular;
	
	//construtor da classe
	public Caixa(){
		super("Exemplo de componentes");
		setLayout(new FlowLayout());
		
		//instanciação
		label1 = new JLabel("Entre com o nome");
		label2 = new JLabel("Entre com a idade");
		caixa1 = new JTextField(20);
		caixa2 = new JTextField(20);
		caixa1.setToolTipText("Entre com o nome");
		caixa2.setToolTipText("Entre com a idade");
		btnCalcular = new JButton("Calcular");
		btnCalcular.setToolTipText("Clique aqui");
		
		//adicionando componentes na janela
		add(label1);
		add(caixa1);
		add(label2);
		add(caixa2);
		add(btnCalcular);
	}
}
