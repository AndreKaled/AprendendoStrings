package InterfacesDoAndre;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janelinha extends JFrame {
	// variaveis de instância
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JTextField caixa1;
	private JTextField caixa2;
	private JTextField caixa3;
	private JTextField caixa4;
	private JButton btnOk;
	private JButton btnCancelar;
	
	//construtor
	public Janelinha(){
		//convocando construtor da superclasse
		super("Janela de Interface Gráfica");
		setLayout(new FlowLayout());
		
		//configurando componentes
		label1 = new JLabel("Nome:");
		label2 = new JLabel("Endereço:");
		label3 = new JLabel("Telefone:");
		label4 = new JLabel("Observações:");
		
		caixa1 = new JTextField(20);
		caixa2 = new JTextField(20);
		caixa3 = new JTextField(20);
		caixa4 = new JTextField(20);
		
		caixa1.setToolTipText("Digite seu nome");
		caixa2.setToolTipText("Digite seu endereço");
		caixa3.setToolTipText("Digite seu telefone");
		caixa4.setToolTipText("Diga meu bem");
		
		btnOk = new JButton("OK");
		btnCancelar = new JButton("CANCELAR");
		
		//adicionando os componentes na janela
		add(label1);
		add(caixa1);
		add(label2);
		add(caixa2);
		add(label3);
		add(caixa3);
		add(label4);
		add(caixa4);
		add(btnOk);
		add(btnCancelar);
	}
}
