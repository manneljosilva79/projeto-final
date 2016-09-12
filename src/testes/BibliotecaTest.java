package testes;

import java.awt.Component;
import java.util.ArrayList;

import junit.framework.TestCase;
import models.Biblioteca;
import models.Livro;

public class BibliotecaTest extends TestCase {

	
	
public BibliotecaTest(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

public static void main (String []args){
	
	
	
	ArrayList<Livro> livros = new ArrayList<Livro>();
	
	Livro l1 = new Livro(null, null, null, null, null, null);  
	l1.setNome("Os Quatro e Meia");
	l1.setAutor("Gonçalo Martins Esteves");
	l1.setCategoria("d");
	l1.setValorizacao("");
	l1.setIsbn(23);
	l1.setCritica(1);
	
	
	Livro l2 = new Livro(null, null, null, null, null, null);
	l2.setNome("A Onda do Paraíso");
	l2.setAutor("Miguel Martins Esteves");
	l2.setCategoria("b");
	l2.setValorizacao("");
	l2.setIsbn(34);
	l2.setCritica(1);
	
	Livro l3 = new Livro(null, null, null, null, null, null);
	l3.nome = "O Mar Oculto";
	l3.autor = "Ricardo Mateiro";
	l3.categoria = "";
	l3.isbn = 111;
	l3.valorizacao = "b";
	l3.critica = 1;

	livros.add(l1);
	livros.add(l2);
	livros.add(l3);
	
	
	}
}
