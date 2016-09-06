package bibliotecatest;

import static org.junit.Assert.*;

import org.junit.Test;

import models.Autor;
import models.Livro;

public class BibliotecaTest1 {

	@Test
	public void test() {
		Livro l = new Livro(null, null, null, null, null, null);
		l.setNome("O Amor entre Dois mundos");
		l.setAutor("Ricardo Morgado");
		l.setCategoria("Romance");
		l.setValorizacao("Muito Valor");
		l.setIsbn(1245);
		l.setCritica("Positiva");
		
		Livro l1 = new Livro(null, null, null, null, null, null);
		l1.setNome("O Casamento de Mafalda");
		l1.setAutor("Antonio Esteves");
		l1.setCategoria("Romance");
		l1.setValorizacao("Muito Valor");
		l1.setIsbn(1248);
		l1.setCritica("Positiva");
		
		Livro l2 = new Livro(null, null, null, null, null, null);
		l2.setNome("Maria Mariana");
		l2.setAutor("Carlos Moreira");
		l2.setCategoria("Romance");
		l2.setValorizacao("Muito Valor");
		l2.setIsbn(1249);
		l2.setCritica("Pouco Positiva");
		
		Autor a1 = new Autor(null, null, null);
		a1.setId_autor(1);
		a1.setNome("Ricardo Morgado");
		a1.setNum_livros(20);
		
		Autor a2 = new Autor(null, null, null);
		a2.setId_autor(2);
		a2.setNome("Antonio Esteves");
		a2.setNum_livros(10);
		
		Autor a3 = new Autor(null, null, null);
		a3.setId_autor(3);
		a3.setNome("Carlos Moreira");
		a3.setNum_livros(19);
		
		
	}

}
