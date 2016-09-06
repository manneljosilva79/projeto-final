package projetorecurso;
/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Autor.
 * 
 * @author Manuel
 */
public class Autor {
	/**
	 * Description of the property id_autor.
	 */
	public Integer id_autor ;

	/**
	 * Description of the property nome.
	 */
	public String nome = "";

	/**
	 * Description of the property num_livros.
	 */
	public Integer num_livros ;
	
	// Start of user code (user defined attributes for Autor)
	
	// End of user code

	/**
	 * The constructor.
	 */
	public Autor(Integer id_autor, String nome, Integer num_livros) {
		// Start of user code constructor for Autor)
		super();
		this.id_autor= id_autor;
		this.nome=nome;
		this.num_livros=num_livros;
		// End of user code
	}

	// Start of user code (user defined methods for Autor)

	// End of user code
	/**
	 * Returns id_autor.
	 * @return id_autor 
	 */
	public Object getId_autor() {
		return this.id_autor;
	}

	/**
	 * Sets a value to attribute id_autor. 
	 * @param newId_autor 
	 */
	public void setId_autor(Integer newId_autor) {
		this.id_autor = newId_autor;
	}

	/**
	 * Returns nome.
	 * @return nome 
	 */
	public Object getNome() {
		return this.nome;
	}

	/**
	 * Sets a value to attribute nome. 
	 * @param newNome 
	 */
	public void setNome(String newNome) {
		this.nome = newNome;
	}

	/**
	 * Returns num_livros.
	 * @return num_livros 
	 */
	public Object getNum_livros() {
		return this.num_livros;
	}

	/**
	 * Sets a value to attribute num_livros. 
	 * @param newNum_livros 
	 */
	public void setNum_livros(Integer newNum_livros) {
		this.num_livros = newNum_livros;
	}

}
