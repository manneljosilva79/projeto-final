package models;






/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Livro.
 * 
 * @author Manuel
 */
public class Livro {
	/**
	 * Description of the property autors.
	 */
	

	/**
	 * Description of the property autor.
	 */
	public String autor = "";

	/**
	 * Description of the property categorias.
	 */


	/**
	 * Description of the property nome.
	 */
	public String nome = "";

	/**
	 * Description of the property categoria.
	 */
	public String categoria = "";

	/**
	 * Description of the property valorizacao.
	 */
	public String valorizacao = "";

	/**
	 * Description of the property bibliotecas.
	 */
	

	/**
	 * Description of the property isbn.
	 */
	public Integer isbn = Integer.valueOf(0);

	/**
	 * Description of the property critica.
	 */
	public Integer critica ;

	/**
	 * Description of the property valorizacaos.
	 */


	// Start of user code (user defined attributes for Livro)

	// End of user code

	/**
	 * The constructor.
	 */
	public Livro(String nome, String autor, String categoria, String valorizacao, Integer isbn, Integer critica) {
		// Start of user code constructor for Livro)
		super();
		this.nome=nome;
		this.autor=autor;
		this.categoria=categoria;
		this.valorizacao=valorizacao;
		this.isbn=isbn;
		this.critica=critica;
		
		// End of user code
	}

	/**
	 * Description of the method VisualizarPerfil.
	 */
	

	/**
	 * Description of the method AlterarValorCritica.
	 */
	

	/**
	 * Returns autor.
	 * @return autor 
	 */
	public String getAutor() {
		return this.autor;
	}

	/**
	 * Sets a value to attribute autor. 
	 * @param newAutor 
	 */
	public void setAutor(String newAutor) {
		this.autor = newAutor;
	}

	/**
	 * Returns categorias.
	 * @return categorias 
	 */
	
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

	/**
	 * Returns categoria.
	 * @return categoria 
	 */
	public String getCategoria() {
		return this.categoria;
	}

	/**
	 * Sets a value to attribute categoria. 
	 * @param newCategoria 
	 */
	public void setCategoria(String newCategoria) {
		this.categoria = newCategoria;
	}

	/**
	 * Returns valorizacao.
	 * @return valorizacao 
	 */
	public String getValorizacao() {
		return this.valorizacao;
	}

	/**
	 * Sets a value to attribute valorizacao. 
	 * @param newValorizacao 
	 */
	public void setValorizacao(String newValorizacao) {
		this.valorizacao = newValorizacao;
	}

	
	/**
	 * Returns isbn.
	 * @return isbn 
	 */
	public Integer getIsbn() {
		return this.isbn;
	}

	/**
	 * Sets a value to attribute isbn. 
	 * @param newIsbn 
	 */
	public void setIsbn(Integer newIsbn) {
		this.isbn = newIsbn;
	}

	/**
	 * Returns critica.
	 * @return critica 
	 */
	public Integer getCritica() {
		return this.critica;
	}

	/**
	 * Sets a value to attribute critica. 
	 * @param newCritica 
	 */
	public void setCritica(Integer newCritica) {
		this.critica = newCritica;
	}

	public String toString() {
		return "Livro [autor=" + autor + ", nome=" + nome + ", categoria=" + categoria + ", valorizacao=" + valorizacao
				+ ", isbn=" + isbn + ", critica=" + critica + "]";
	}

	/**
	 * Returns valorizacaos.
	 * @return valorizacaos 
	 */
	

}
