package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

import models.Livro;

public class LivroPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public LivroPanel(Livro l) {
		setLayout(null);
		
		JLabel nome = new JLabel("Nome do Livro: ");
		nome.setBounds(116, 66, 75, 14);
		add(nome);
		
		JLabel autor = new JLabel("Autor do Livro: ");
		autor.setBounds(116, 96, 105, 14);
		add(autor);
		
		JLabel categoria = new JLabel("Categoria: ");
		categoria.setBounds(116, 125, 136, 14);
		add(categoria);
		
		JLabel c = new JLabel(l.getCategoria()+"");
		c.setBounds(116, 125, 136, 14);
		add(c);
		
		JLabel nm = new JLabel(l.getNome()+" ");
		nm.setBounds(182, 23, 82, 16);
		add(nm);

		JLabel lblA = new JLabel(l.getAutor()+" ");
		lblA.setBounds(346, 23, 82, 16);
		add(lblA);


	}

}
