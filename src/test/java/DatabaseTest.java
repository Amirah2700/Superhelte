import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database db;

    @org.junit.jupiter.api.Test


    @BeforeEach
    void setUp() {
        db = new Database();

    }
    @BeforeEach
    public void setup(){
        db = new Database();
        Superhero superhero1 = new Superhero("Batman", "Bruce Wayne", "Fighting");
        Superhero superhero2 = new Superhero("Superman", "Clark Kent", "Flying");
        Superhero superhero3 = new Superhero("Spiderman", "Peter Parker", "Spider");
        db.getSuperheroes().add(superhero1);
        db.getSuperheroes().add(superhero2);
        db.getSuperheroes().add(superhero3);
    }
    @Test
    void addSuperhero() {
        db.addSuperhero("Batman", "Bruce Wayne", "Fighting");
        assertEquals(db.getSize(),4);
    }

    @org.junit.jupiter.api.Test

    void findSuperHero(){
            assertEquals(db.findSuperHero("Superman").get(0).getSuperHeroName(), "Superman");
        }
    }