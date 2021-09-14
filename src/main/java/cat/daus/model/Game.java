package cat.daus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//@Document(collection="games")
@Entity
@Table(name="game")
public class Game {

	   
	    
	    @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) // Genera camps clau
		@Column(name = "id")
	    private int id;
	   
	    //@Field(name= "dau1")
	    @Column(name = "dau1")
	    private int dau1;
	    
	    //@Field(name= "dau2")
	    @Column(name = "dau2")
	    private int dau2;
	    
	    //@Field(name="resultat")
	    @Column(name = "resultat")
	    private boolean resultat;
	    
	    //@Field(name="IdUsuari")
	    @Column(name = "Id_Usuari")
	    private int idUsuari;
	    
	    //Constructor per defecte
	    
	    public Game() {
	    	
	    }
	    
	    //Getter & Setters
	    
	    	

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getDau1() {
			return dau1;
		}

		public void setDau1(int dau1) {
			this.dau1 = dau1;
		}

		public int getDau2() {
			return dau2;
		}

		public void setDau2(int dau2) {
			this.dau2 = dau2;
		}

		public boolean isResultat() {
			return resultat;
		}

		public void setResultat(boolean resultat) {
			this.resultat = resultat;
		}

		public int getIdUsuari() {
			return idUsuari;
		}

		public void setIdUsuari(int idUsuari) {
			this.idUsuari = idUsuari;
		}

		@Override
		public String toString() {
			return "Game [id=" + id + ", dau1=" + dau1 + ", dau2=" + dau2 + ", resultat=" + resultat + ", idUsuari="
					+ idUsuari + "]";
		}
	    
		
	   
	    
	    
}

