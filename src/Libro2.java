import java.util.ArrayList;

public class Libro2 {
	
	private String titulo;
	private int anyo;
	private ArrayList<String> autores;
	private String editor;
	private int paginas;
	
	
	public Libro2(String titulo, int anyo, ArrayList<String> autores, String editor, int paginas) {
		super();
		this.titulo = titulo;
		this.anyo = anyo;
		this.autores = autores;
		this.editor = editor;
		this.paginas = paginas;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getAnyo() {
		return anyo;
	}


	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public ArrayList<String> getAutores() {
		return autores;
	}


	public void setAutores(ArrayList<String> autores) {
		this.autores = autores;
	}


	public String getEditor() {
		return editor;
	}


	public void setEditor(String editor) {
		this.editor = editor;
	}


	public int getPaginas() {
		return paginas;
	}


	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	
	

}
