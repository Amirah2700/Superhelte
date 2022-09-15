public class Superhero {


    private String superHeroName;
    private String realName;
    private String superPower;

    private String allAttributes;

    public String getSuperHeroName(){
        return this.superHeroName;
    }

    public String getRealName() {
        return this.realName;
    }
public String getSuperPower(){
        return this.superPower;
}
    public String getAllAttributes(){
        return this.allAttributes;
    }


    public Superhero(String superHeroName, String realName, String superPower) {
        this.superHeroName = superHeroName;
        this.realName = realName;
        this.superPower = superPower;
    }


        public String toString() {
            allAttributes =  superHeroName + " - " + realName + " - " + superPower;
            return allAttributes;}

        public void setSuperHeroName(String superHeroName){
            this.superHeroName = superHeroName;
            //public void setRealName(String realName){
                this.superHeroName = realName;

                //public void setSuperPower(String superPower){
                    //this.superHeroName = superPower;

        }
    }
