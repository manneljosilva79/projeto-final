package models;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

import bibliotecainterfaces.AlterarPropriedadesLivro;
import bibliotecainterfaces.Critica;
import bibliotecainterfaces.VisualizarLivro;
import models.Valorizacao;

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
public class Livro implements VisualizarLivro{
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
	public String critica = "";

	/**
	 * Description of the property valorizacaos.
	 */


	// Start of user code (user defined attributes for Livro)

	// End of user code

	/**
	 * The constructor.
	 */
	public Livro(String nome, String autor, String categoria, String valorizacao, Integer isbn, String critica) {
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
	public void VisualizarPerfil(Livro l) {
		// Start of user code for method VisualizarPerfil
		VisualizarLivro visualizar = null ;
		visualizar.escolherLivro(l);
		visualizar.visualizar(l);
	
		// End of user code
	}

	/**
	 * Description of the method AlterarValorCritica.
	 */
	public void AlterarValorCritica() {
		
		
	}

	/**
	 * Description of the method InserirValorCriticaa.
	 */
	public void InserirValorCriticaa() {
		// Start of user code for method InserirValorCriticaa
		
		// End of user code
	}

	/**
	 * Description of the method AlterarValorPropriedades.
	 */
	public void AlterarValorPropriedades(Livro l) {
		// Start of user code for method AlterarValorPropriedades
		AlterarPropriedadesLivro alterar = null;
		
		alterar.Escolher(l);
		alterar.Alterar(l);
		// End of user code
	}

	// Start of user code (user defined methods for Livro)

	// End of user code
	/**
	 * Returns autors.
	 * @return autors 
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
	public String getCritica() {
		return this.critica;
	}

	/**
	 * Sets a value to attribute critica. 
	 * @param newCritica 
	 */
	public void setCritica(String newCritica) {
		this.critica = newCritica;
	}

	@Override
	public String escolherLivro(Livro l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visualizar(Livro l) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object toLowerCase1() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object toLowerCase() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns valorizacaos.
	 * @return valorizacaos 
	 */
	

}
