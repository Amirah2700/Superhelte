import java.util.ArrayList;

public class Database {

    public ArrayList<Superhero> getSuperheroes() {
        return superheroes;
    }

    private ArrayList<Superhero> superheroes = new ArrayList<>();


    public void addSuperhero(String superHeroName, String realName, String superPower) {
        Superhero superhero = new Superhero(superHeroName, realName, superPower);
        superheroes.add(superhero);


    }

    public ArrayList<Superhero> findSuperHero(String heroName) {
        ArrayList<Superhero> superheroes1 = new ArrayList<>();
        for (int i = 0; i < superheroes.size(); i++) {
            if (superheroes.get(i).getSuperHeroName().toLowerCase().contains(heroName.toLowerCase())) {
                superheroes1.add(superheroes.get(i));

            }
        }

        return superheroes1;

    }

    public int getSize() {
        return superheroes.size();
    }

    public String toString() {
        StringBuilder databasestring = new StringBuilder();
        if (superheroes.size() > 0) {
            for (Superhero superhero : superheroes) {
                databasestring.append(superhero.toString());
            }
        }
        System.out.println(" List of superheroes " + databasestring);
        return String.valueOf(databasestring);



    }

    public boolean deleteHero (Superhero superhero){
        return superheroes.remove(superhero);
    }
}



