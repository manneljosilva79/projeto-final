package bibliotecainterfaces;

import models.Livro;

public interface VisualizarLivro {
	String escolherLivro(Livro l);
	
	String visualizar(Livro l);
}
