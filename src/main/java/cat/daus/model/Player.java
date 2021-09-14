package cat.daus.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;




//@Document(collection = "players")
@Entity
@Table(name="players")
public class Player {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Genera camps clau
	@Column(name = "id")
	private int id;

	
	//@Field(name = "usuari")
	@Column(name = "usuari")//, nullable = false, length = 30)
	private String usuari;

	//@Field(name = "data")
	@Column(name="data")
	private LocalDateTime data;

	//Constructors
	public Player() {

	}

	public Player( String usuari, LocalDateTime data) {
		
		this.usuari = usuari;
		this.data = data;
	}

	//Getters & Setters
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuari() {
		return usuari;
	}

	public void setUsuari(String usuari) {
		this.usuari = usuari;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime localDateTime) {
		this.data = localDateTime;
	}
	
	
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", usuari=" + usuari + ", data=" + data + "]";
	}
	
	
	
	
}
