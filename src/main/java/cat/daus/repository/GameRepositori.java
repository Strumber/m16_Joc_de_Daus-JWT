package cat.daus.repository;

import java.util.List;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import cat.daus.model.Game;

//para Mongo
//public interface GameRepositori extends MongoRepository<Game, Integer> {

//para mySql
public interface GameRepositori extends JpaRepository<Game, Integer> {
	List<Game> findGamesByIdUsuari (int IdUsuari);
	boolean existsGamesByIdUsuari(int IdUsuari);
	int deleteGamesByIdUsuari (int IdUsuari);
}
