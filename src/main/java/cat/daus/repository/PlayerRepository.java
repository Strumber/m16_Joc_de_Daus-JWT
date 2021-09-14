package cat.daus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.mongodb.repository.MongoRepository;
import cat.daus.model.Player;

//para Mongo
//public interface PlayerRepository extends MongoRepository<Player, Integer> {

//para mySql
public interface PlayerRepository extends JpaRepository<Player, Integer> {	
		
	//public ArrayList<Player> getPlayers();
		
	}


