package view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Exercicio_02 extends JFrame{

		
	
	JTextField txtVisor = new JTextField();
	
	JLabel label_valorA = new JLabel("Valor de a");
	JTextField valor_a = new JTextField();
	
	JLabel label_valorB = new JLabel("Valor de b");
	JTextField valor_b = new JTextField();
	
	JLabel label_valorC = new JLabel();
	
	JButton calcular = new JButton("Calcular");
	
	
	double a,b,c,c2;
	public Exercicio_02() {
		
		super("Exercício 01");
		
		Container pane = this.getContentPane();
								
		pane.add(label_valorA);
		label_valorA.setBounds(20,10,290,25);
		
		pane.add(valor_a);
		valor_a.setBounds(20,35,290,25);
		
		pane.add(label_valorB);
		label_valorB.setBounds(20,60,290,25);
		
		pane.add(valor_b);
		valor_b.setBounds(20,85,290,25);
				
		pane.add(label_valorC);
		label_valorC.setBounds(20,110,290,25);
		
		pane.add(calcular);
		calcular.setBounds(20,250,300,50);
		calcular.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				a = Double.parseDouble(valor_a.getText());
				b = Double.parseDouble(valor_b.getText());
				
				c2 = Math.pow(a,2) + Math.pow(b,2);
				c = Math.sqrt(c2);
				
				label_valorC.setText("O Resultado do calculo de pitagoras é: " + c);
				
			}
		});
		
		this.setLayout(null); // metodo responsavel por definir o posicionamento dos objetos no layout
		this.setVisible(true); // responsavel por deixar a tela visivel
		this.setSize(350,360); // dimensões da tela 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String args[]){
		
		Exercicio_02 pf = new Exercicio_02();
		
	}
	
}
