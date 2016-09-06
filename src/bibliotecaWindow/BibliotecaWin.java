package bibliotecaWindow;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import bibliotecainterfaces.DeterminarMelhoresLivros;
import projetorecurso.Autor;

import projetorecurso.Livro;

public class BibliotecaWin extends JFrame {
protected static final String String = null;

static ArrayList<Autor> listaautores;
static ArrayList<Livro> livrosrecentes3meses;

	private int MaxList;
	private int Atual;
	private JPanel contentPane;
	private JFrame frame;
	private JList list;
	private Livro[] livrosList;
	private BibliotecaWin bib;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BibliotecaWin bib = new BibliotecaWin();
					bib.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BibliotecaWin() {
		Atual = 0;
		iniciar();
		livrosList = new Livro[MaxList];
		abrirFicheiro();
		MaxList = 10000;
		
		}
//-------------------------------------------------------------------------	
	private void abrirFicheiro() {
		File f = new File("C:\\Users\\Manuel\\Documents\\laboratórios de programação\\Biblioteca.txt");
		FileInputStream fis;
		try {
			fis = new FileInputStream(f); //connect the file input stream
			ObjectInputStream ois = new ObjectInputStream(fis); //build the object input stream

			Atual = ois.readInt();
			MaxList = ois.readInt();
			livrosList = (Livro[])ois.readObject();

			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		
	}
//-----------------------------------------------------------------------------
	public void iniciar(){
		contentPane = null;
		JFrame frame = new JFrame();
		frame.setTitle("Biblioteca");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInserirLivro = new JButton("Inserir Livro");
		btnInserirLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				java.lang.String newNome = null;
				java.lang.String newCritica = null;
				Integer newISBN = null;
				java.lang.String newAutor = null;
				java.lang.String newValorizacao = null;
				java.lang.String newCategoria = null;
				Livro l = new Livro(newNome, newAutor, newCategoria, newValorizacao, newISBN, newCritica);
				l.setNome(newNome);
				l.setAutor(newAutor);
				l.setCategoria(newCategoria);
				l.setIsbn(newISBN);
				l.setValorizacao(newValorizacao);
				l.setCritica(newCritica);
			
				
				}
		});
		btnInserirLivro.setBounds(10, 26, 116, 23);
		contentPane.add(btnInserirLivro);
		
		
		
		JButton btnDeterminarLivros = new JButton("Determinar os 3 melhores livros");
		btnDeterminarLivros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					DeterminarMelhoresLivros determinar;
					Scanner ent = new Scanner(System.in); 
				        int num, deter = 1; 
					       int cont = 1; 

					 
					        do{ 
					            System.out.println(""); 
					             num = ent.nextInt(); 
					              
					            for(int i = 1;i <= num; i++){ 
					                deter = deter * i; 
					             } 
					              
					             System.out.println("!" + num + " = " + deter); 
					             cont++; 
					              
					        }while(cont < 2); 
					    } 
			
			}
		});
		btnDeterminarLivros.setBounds(10, 127, 116, 23);
		contentPane.add(btnDeterminarLivros);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(179, 25, 231, 196);
		contentPane.add(textArea);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
			    if (e.getValueIsAdjusting() == false) {
			    	System.out.println("selected:"+list.getSelectedIndex());
			        if (list.getSelectedIndex() == -1) {
			        	if(contentPane!=null)
			    			frame.getContentPane().remove(contentPane);
			        	contentPane = null;
			        } else {
			        	if(contentPane!=null)
			    			frame.getContentPane().remove(contentPane);
			        	
			        	
			        	if(contentPane!=null){
			        		frame.getContentPane().add(contentPane);
			        		contentPane.setBounds(0, 270, 450, 250);
			        	}
			        }
					frame.getContentPane().revalidate();
					frame.getContentPane().repaint();
			    }
			}
		});
		

		
		JButton btnVisualizarClientes = new JButton("Visualizar Todos os Livros");
		btnVisualizarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirFicheiro();
			}
		});
		btnVisualizarClientes.setBounds(10, 193, 116, 23);
		contentPane.add(btnVisualizarClientes);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 ArrayList<Livro> livros = null;
				for(Livro livro : livros){
					    if(((ArrayList<Livro>) livro.toLowerCase()).indexOf(livro.getNome().toLowerCase()) >= 0){
					        ((ArrayList<Livro>) livros).add(livro);
					    }
					}
			}
		});
		btnVisualizarClientes.setBounds(10, 161, 116, 23);
		contentPane.add(btnVisualizarClientes);
		
		JLabel lblInserirLivro = new JLabel("Inserir Livro");
		lblInserirLivro.setBounds(41, 30, 46, 14);
		contentPane.add(lblInserirLivro);
		
		
		JLabel lblVisualizarlivros = new JLabel("Visualizar Livros");
		lblVisualizarlivros.setBounds(41, 131, 46, 14);
		contentPane.add(lblVisualizarlivros);
		
		JLabel lblVisualizarCliente = new JLabel("Visualizar Cliente");
		lblVisualizarCliente.setBounds(41, 165, 46, 14);
		contentPane.add(lblVisualizarCliente);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(54, 79, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblNumerocontribuinte = new JLabel("isbn");
		lblNumerocontribuinte.setBounds(54, 79, 46, 14);
		contentPane.add(lblNumerocontribuinte);
		
		JLabel lblProfissao = new JLabel("Valorizacao");
		lblProfissao.setBounds(54, 79, 46, 14);
		contentPane.add(lblProfissao);
		
		JLabel lblDataentrada = new JLabel("critica");
		lblDataentrada.setBounds(41, 79, 46, 14);
		contentPane.add(lblDataentrada);
		
		JLabel lblLivro = new JLabel("categoria");
		lblLivro.setBounds(41, 79, 46, 14);
		contentPane.add(lblLivro);
		
		JLabel lblNome_1 = new JLabel("Nome");
		lblNome_1.setBounds(41, 30, 46, 14);
		contentPane.add(lblNome_1);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(41, 30, 46, 14);
		contentPane.add(lblAutor);
		
		
		
		frame.getContentPane().add(contentPane);
		frame.getContentPane().revalidate();
		frame.repaint();
		
	}


	//------------------------------------------------------------------------------
	public void update(){
		DefaultListModel tempModel = new DefaultListModel();
		list.removeAll();
		for (int i=0; i<Atual; i++){
			tempModel.addElement(livrosList[i].toString());
			System.out.println(livrosList[i].toString());
		}
		list.setListData(tempModel.toArray());
		frame.getContentPane().revalidate();
		list.revalidate();
		list.repaint();

	}
//------------------------------------------------------------------------------
	public void removeCurrentBottomPanel(){
		if(contentPane!=null)
			frame.getContentPane().remove(contentPane);
		contentPane = null;
		frame.getContentPane().revalidate();
		frame.getContentPane().repaint();
	} 



	}


