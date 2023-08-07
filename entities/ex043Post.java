package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ex043Post {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String comentario;
	private Integer likes;
	
	private List<ex043Comentarios> coment = new ArrayList<>();
	
	public ex043Post() {
	}

	public ex043Post(Date momento, String titulo, String comentario, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.comentario = comentario;
		this.likes = likes;
	}



	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void addComentario(ex043Comentarios comentario) {
		coment.add(comentario);
	}
	
	public void removeComentario(ex043Comentarios comentario) {
		coment.remove(comentario);
	}

	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes +" Linkes - ");
		sb.append(sdf.format(momento) + "\n");
		sb.append(comentario + "\n");
		sb.append("Comentarios: \n");
		for(ex043Comentarios c : coment) {
			sb.append(c.getTexto()+ "\n");
		}
		return sb.toString();
	}
	
	

}
