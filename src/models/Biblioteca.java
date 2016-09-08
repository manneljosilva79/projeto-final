package models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import interfaces.DeterminarMelhoresLivros;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Biblioteca.
 * 
 * @author Manuel
 */
public class Biblioteca {
	ArrayList<Livro> livros = new ArrayList<Livro>();
	/**
	 * Description of the property nome.
	 */
	public String nome = "";

	// Start of user code (user defined attributes for Biblioteca)

	// End of user code

	/**
	 * The constructor.
	 */
	public Biblioteca(String nome) {
		// Start of user code constructor for Biblioteca)
		super();
		this.nome = nome;
		// End of user code
	}

	@SuppressWarnings("unchecked")
	public void carregaLivrosDoFicheiro(String nomeFicheiro) throws ClassNotFoundException {
		
		ObjectInputStream oin = null;

        try {
            oin = new ObjectInputStream(new FileInputStream(nomeFicheiro));
            livros = (ArrayList<Livro>) oin.readObject();

        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            if (oin != null) {
                try {
					oin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }

	}

	// Start of user code (user defined methods for Biblioteca)

	// End of user code
	/**
	 * Returns nome.
	 * 
	 * @return nome
	 */
	public Object getNome() {
		return this.nome;
	}

	/**
	 * Sets a value to attribute nome.
	 * 
	 * @param newNome
	 */
	public void setNome(String newNome) {
		this.nome = newNome;
	}

	/**
	 * Description of InserirLivro.
	 * 
	 * @author Manuel
	 */
	public void InserirLivro(String newNome, String newAutor, String newCategoria, Integer newISBN,
			String newValorizacao, Integer newCritica) {
		// Start of user code (user defined attributes for InserirLivro)

		Livro l = new Livro(newNome, newAutor, newCategoria, newValorizacao, newISBN, newCritica);
		l.setNome(newNome);
		l.setAutor(newAutor);
		l.setCategoria(newCategoria);
		l.setIsbn(newISBN);
		l.setValorizacao(newValorizacao);
		l.setCritica(newCritica);
		livros.add(l);
	}

	// End of user code
	// ------------------------------------------------------------------------
	public void RemoverLivro(String nome) {

		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getNome().equals(nome))

				livros.remove(i);
		}
	}

	// -----------------------------------------------------------------------------
	public void guardarLivros(String fileName) {

		ObjectOutputStream oout = null;

		try {
			oout = new ObjectOutputStream(new FileOutputStream(fileName));
			oout.writeObject(this.livros);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Ficheiro nao encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oout != null) {
				try {
					oout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	// ------------------------------------------------------------------------
	public void Determinar() {
		{
			DeterminarMelhoresLivros determinar;
			Scanner ent = new Scanner(System.in);
			int num, deter = 1;
			int cont = 1;

			do {
				System.out.println("");
				num = ent.nextInt();

				for (int i = 1; i <= num; i++) {
					deter = deter * i;
				}

				System.out.println("!" + num + " = " + deter);
				cont++;

			} while (cont < 2);
		}

		/**
		 * The constructor.
		 */

		// Start of user code (user defined methods for InserirLivro)

		// End of user code

	}

	// --------------------------------------------------------------------------
	public void Pesquisar() {
		for (Livro livro : livros) {
			if (((ArrayList<Livro>) livro.toLowerCase()).indexOf(livro.getNome().toLowerCase()) >= 0) {
				livros.add(livro);
			}
		}
	}

	// ---------------------------------------------------------------------------
	public void inserirValorCritica(int isbn) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).isbn == isbn) {

				int critica;
				do {
					System.out.println("Inserir Valor da Critica: ");
					Scanner scanner = new Scanner(System.in);
					critica = scanner.nextInt();

				} while (critica < 1 || critica > 10);

				livros.get(i).setCritica(critica);
				break;
			}
		}
	}

	// ---------------------------------------------------------------------------
	public void AlterarLivro() {
		for (Livro livro : livros) {
			if (nome == livro.getNome()) {
				// Altere o valor da passagem
				livro.setNome("");
				livro.setAutor("");
				// Assim por diante
			}
		}
	}

	// ---------------------------------------------------------------------------------
	public void VizualizarLivro(int isbn) {
		for (Livro livro : livros) {
			if (livro.getIsbn() == isbn) {
				System.out.println(livro.toString());
			}

		}
	}

	// ----------------------------------------------------------------------------
	public void VisualizarTodosLivros() {

		for (Livro l : livros) {
			System.out.println(l.toString());
		}
	}
}
