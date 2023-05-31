package io.datajek.sprindatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springdata.tennisplayer.PlayerDao;

import java.sql.Date;

@SpringBootApplication
public class TennisPlayerSpringDataApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PlayerSpringDataRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(TennisPlayerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("\n\n>> Inserting Player: {}\n", repo.save(
                new Player("Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81)
        ));

        logger.info("\n\n>> Inserting Player: {}\n", repo.save(
                new Player("Monfils", "France", Date.valueOf("1986-09-01"), 10)
        ));

        logger.info("\n\n>> Inserting Player: {}\n", repo.save(
                new Player("Thiem", "Austria", new Date(System.currentTimeMillis()), 17))
        );

        logger.info("\n\n>> Updating Player: {}\n", repo.save(
                new Player(3, "Thiem", "Austria", Date.valueOf("1993-09-03"), 17 )
        ));

        logger.info("Player with Id 2: {}", repo.findById(2));

        logger.info("All Players Data: {}", repo.findAll());

        repo.deleteById(2);
    }
}
