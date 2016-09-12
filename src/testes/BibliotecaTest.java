package testes;

import java.awt.Component;
import java.util.ArrayList;

import junit.framework.TestCase;
import models.Biblioteca;
import models.Livro;

public class BibliotecaTest extends TestCase {

	
	
	@org.junit.Test
public void InserirLivro() {
		
		
		Livro l1 = new Livro(null, null, null, null, null, null);  
		l1.setNome("Os Quatro e Meia");
		
		assertEquals("Os Quatro e Meia", l1.getNome());
		
		
	
		
		
		
	
	}


}
