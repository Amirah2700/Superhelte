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
    public Superhero findSuperHero(String heroName){
      for(int i = 0; i < superheroes.size(); i++){
          if (superheroes.get(i).getSuperHeroName().toLowerCase().contains(heroName.toLowerCase())){
             return superheroes.get(i);
          }
      }
        System.out.println("The name doesn't exist");
      return null;
    }
}



