public class Superhero {


    private String superHeroName;
    private String realName;
    private String superPower;

    private String allAttributes;


    public Superhero(String superHeroName, String realName, String superPower) {
        this.superHeroName = superHeroName;
        this.realName = realName;
        this.superPower = superPower;
    }


        public String toString() {
            allAttributes = superHeroName + " " + realName + " " + superPower;
            return allAttributes;}

        public void setSuperHeroName(String superHeroName){
            this.superHeroName = superHeroName;

        }
    }

