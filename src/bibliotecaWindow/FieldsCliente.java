package bibliotecaWindow;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FieldsCliente extends JPanel {
	private JTextField textField;

	private JTextField textField2;
	private JTextField textField3;
	/**
	 * Create the panel.
	 */
	public FieldsCliente() {
		setLayout(null);
		
		JLabel nome = new JLabel("Nome");
		nome.setBounds(28, 42, 103, 14);
		add(nome);
		
		JLabel dataentrada = new JLabel("Data de entrada: ");
		dataentrada.setBounds(28, 67, 125, 14);
		add(dataentrada);
		
		JLabel profissao = new JLabel("Profissao :");
		profissao.setBounds(28, 92, 63, 14);
		add(profissao);
		
		JLabel numcontribuinte = new JLabel("Numero de Contribuinte: ");
		numcontribuinte.setBounds(28, 112, 95, 14);
		add(numcontribuinte);
		
		textField = new JTextField();
		textField.setBounds(123, 39, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(146, 64, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(83, 89, 86, 20);
		add(textField2);
		textField2.setColumns(10);

		textField3 = new JTextField();
		textField3.setBounds(103, 112, 86, 20);
		add(textField3);
		textField3.setColumns(10);
	}

}
