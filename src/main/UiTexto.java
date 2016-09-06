package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import models.Biblioteca;

public class UiTexto {
	
    private boolean isExit, isFinish;
    private Biblioteca bib;
    
    public UiTexto(){
    	isFinish = false;
    	bib = new Biblioteca("Biblioteca Manuelina");
    	
    }
    
    void iuMenu() {

        while (!isFinish) {

            System.out.println(" :::::::::  Biblioteca  ::::::::::::");
            System.out.println(" 1. Inserir livro");
            System.out.println(" 2. Alterar livro");
            System.out.println(" 3. Remover livro");
            System.out.println(" 4. Inserir valor critico");
            System.out.println(" 5. Alterar valor critica");
            System.out.println(" 6. Remover ligacao entre dois utilizados");
            System.out.println(" 7. Alterar propriedades de valorizacao");
            System.out.println(" 8. Apresentar todos os livros");
            System.out.println(" 9. Quit");
            System.out.print(" Option: ");

            int option;

            try {
                Scanner mScanner = new Scanner(System.in);
                option = mScanner.nextInt();

                switch (option) {
                    case 1:
                    	adicionaLivro();
                        isFinish = true;
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        break;
                    case 9:
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
    	
    	System.out.println("Critica: \n");
    	String critica = scanner.nextLine();
    	
    	bib.InserirLivro(nome, autor, categoria, isbn, valorizacao, critica);
    	System.out.println("Inserido com sucesso!");
    }
}
