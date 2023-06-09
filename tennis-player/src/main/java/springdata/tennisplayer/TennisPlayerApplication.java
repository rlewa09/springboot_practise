package springdata.tennisplayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class TennisPlayerApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerDao dao;

	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("Inserting Player 4: {}", dao.insertPlayer(new Player(4, "Thiem", "Austraia", new Date(System.currentTimeMillis()), 17)));
//
//		logger.info("Updating Player with Id 4: {}", dao.updatePlayer(new Player(4, "Thiem", "Austraia", Date.valueOf("1993-09-03"), 17)));
//
//		logger.info("All Players Data: {}", dao.getAllPlayers());
//		logger.info("Get player by Id 4: {}", dao.getPlayerById(4));
//
//		logger.info("Deleting player with ID 2: {}", dao.deletePlayer(2));
//
//		logger.info("All Players Data: {}", dao.getAllPlayers());

//		dao.createTournamentTable();

		logger.info("French Players: {}", dao.getPlayerByNationality("France"));
	}
}