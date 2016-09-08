package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import models.Biblioteca;

public class UiTexto {
	
    private boolean isExit, isFinish;
    private Biblioteca bib;
    
    public UiTexto() throws ClassNotFoundException{
    	isFinish = false;
    	bib = new Biblioteca("Biblioteca Manuelina");
    	bib.carregaLivrosDoFicheiro("ficheiroLivros.bin");	
    }
    
    void iuMenu() {

        while (!isFinish) {

            System.out.println(" :::::::::  Biblioteca  ::::::::::::");
            System.out.println(" 1. Inserir livro");
            System.out.println(" 2. Alterar livro");
            System.out.println(" 3. Remover livro");
            System.out.println(" 4. Inserir valor critico");
            System.out.println(" 5. Alterar valor critica");
            System.out.println(" 6. Visualizar Perfil de um livro");
            System.out.println(" 7. Guardar");
            System.out.println(" 8. Alterar propriedades de valorizacao");
            System.out.println(" 9. Apresentar todos os livros");
            
            System.out.println(" 10. Quit");
            System.out.print(" Option: ");

            int option;

            try {
                Scanner mScanner = new Scanner(System.in);
                option = mScanner.nextInt();

                switch (option) {
                    case 1:
                    	adicionaLivro();
                        break;
                    case 2:
                      
                        break;
                    case 3:
                    	eliminaLivro();
                        break;
                    case 4:
                    	inserirValorCritica();
                    	break;
                    case 5:
                    	inserirValorCritica();
                    	break;
                    case 6:
                    	visualizarPerfil();
                    	break;
                    case 7:
                    	guardarLivrosNoFicheiro();
                    	break;
                    case 9:
                    	apresentarLivros();
                    	break;
                    case 10:
                        isFinish = true;
                        isExit = true;
                        System.out.println("See you next time, mate!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Wrong caracter");

            }
        }
    }
  

	private void guardarLivrosNoFicheiro() {
		bib.guardarLivros("ficheiroLivros.bin");
		System.out.println("Guardado com sucesso!");
	}

	private void visualizarPerfil() {
		System.out.println("Código do livro: ");
		Scanner scanner = new Scanner(System.in);
		int isbn = scanner.nextInt();
		bib.VizualizarLivro(isbn);
		System.out.println("Visualizado com sucesso!");

		
	}

	private void inserirValorCritica() {
		// TODO Auto-generated method stub
		
		System.out.println("Código do livro: ");
		Scanner scanner = new Scanner(System.in);
		int isbn = scanner.nextInt();
		bib.inserirValorCritica(isbn);
		System.out.println("Inserido com sucesso!");
	}

	//-----------------------------------------------------------------------------
    private void eliminaLivro() {
    	System.out.println("Nome do livro: ");
    	Scanner scanner = new Scanner(System.in);
    	String nome = scanner.nextLine();
		bib.RemoverLivro(nome);
		System.out.println("Eliminado com sucesso!");
	}

	private void apresentarLivros() {
		bib.VisualizarTodosLivros();
	}

	private void adicionaLivro(){
    	
    	System.out.println("Nome do livro: \n");
    	Scanner scanner = new Scanner(System.in);
    	String nome = scanner.nextLine();
    	
    	System.out.println("Autor do livro: \n");
    	String autor = scanner.nextLine();
    	
    	System.out.println("Categoria\n");
    	String categoria = scanner.nextLine();
    	
    	System.out.println("ISBN:\n ");
    	int isbn = scanner.nextInt();
    	
    	System.out.println("Valorizacao:\n ");
    	String valorizacao = scanner.nextLine();
    	
    	bib.InserirLivro(nome, autor, categoria, isbn, valorizacao, -1);
    	System.out.println("Inserido com sucesso!");
    }
}
