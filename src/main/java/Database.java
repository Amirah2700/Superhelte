public class Database {


    private Superhero[] database= new Superhero[5];
    int count = 0;

    public void addSuperhero(String superHeroName, String realName, String superPower) {
        Superhero superhero = new Superhero(superHeroName, realName,superPower);
        database[count] = superhero;
        count++;
    }

}



