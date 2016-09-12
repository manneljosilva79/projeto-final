package testes;




import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;
import main.UiTexto;
import models.Livro;

public class BibliotecaTest {
	ArrayList<Livro> livros = new ArrayList<Livro>();
	
	
@Test
public void InserirLivro() throws Exception {
		Livro l = new Livro(null, null, null, null, null, null);
		l.setNome("Jangada de Pedra");
		l.setAutor("José Saramago");
		l.setCategoria("Romance");
		l.setValorizacao("Sem Valor");
		l.isbn = 11;
	
		Assert.assertEquals("Jangada de Pedra", l.getNome());
		Assert.assertEquals("José Saramago", l.getAutor());
		Assert.assertEquals("Romance", l.getCategoria());
		Assert.assertEquals("Sem Valor", l.getValorizacao());
		
	
		livros.add(l);
		
		Livro l2 = new Livro(null, null, null, null, null, null);
		l2.setNome("Os Maias");
		l2.setAutor("Eça de Queirós");
		l2.setCategoria("Romance");
		l2.setValorizacao("Muito Valor");

		Assert.assertEquals("Os Maias", l2.getNome());
		Assert.assertEquals("Eça de Queirós",l2.getAutor());
		Assert.assertEquals("Romance",l2.getCategoria());
		Assert.assertEquals("Muito Valor",l2.getValorizacao());
		
	
	}

public void RemoverLivro() throws Exception{
	Livro l = new Livro(null, null, null, null, null, null);
	l.setNome("Jangada de Pedra");
	
	UiTexto ut = new UiTexto();
	ut.eliminaLivro();
}
}
