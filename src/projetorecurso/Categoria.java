package projetorecurso;
import java.util.HashSet;

import projetorecurso.Livro;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Categoria.
 * 
 * @author Manuel
 */
public class Categoria {
	/**
	 * Description of the property id_categoria.
	 */
	public Integer id_categoria = Integer.valueOf(0);

	/**
	 * Description of the property livros.
	 */


	/**
	 * Description of the property nome.
	 */
	public String nome = "";

	// Start of user code (user defined attributes for Categoria)

	// End of user code

	/**
	 * The constructor.
	 */
	public Categoria(Integer id_categoria, String nome) {
		// Start of user code constructor for Categoria)
		super();
		this.id_categoria=id_categoria;
		this.nome=nome;
		// End of user code
	}

	// Start of user code (user defined methods for Categoria)

	// End of user code
	/**
	 * Returns id_categoria.
	 * @return id_categoria 
	 */
	public Integer getId_categoria() {
		return this.id_categoria;
	}

	/**
	 * Sets a value to attribute id_categoria. 
	 * @param newId_categoria 
	 */
	public void setId_categoria(Integer newId_categoria) {
		this.id_categoria = newId_categoria;
	}

	/**
	 * Returns livros.
	 * @return livros 
	 */
	public HashSet<Livro> getLivros() {
		return this.getLivros();
	}

	/**
	 * Returns nome.
	 * @return nome 
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Sets a value to attribute nome. 
	 * @param newNome 
	 */
	public void setNome(String newNome) {
		this.nome = newNome;
	}

}
