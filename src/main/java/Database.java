import java.util.ArrayList;

public class Database {

public ArrayList<Superhero> getSuperheroes(){
    return superheroes;
}

 private ArrayList<Superhero>superheroes = new ArrayList<>();


    public void addSuperhero(String superHeroName, String realName, String superPower) {
        Superhero superhero = new Superhero(superHeroName, realName,superPower);
    superheroes.add(superhero);


    }

}



