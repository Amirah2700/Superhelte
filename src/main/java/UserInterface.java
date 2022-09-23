import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner = new Scanner(System.in);
    Database heroDatabase = new Database();

    public void startProgram() {
        int brugervalg = 0;
        do {
            System.out.println("""
                    Welcome to my superhero universe.
                    Press 1: Create Hero
                    Press 2: Show list of superheroes
                    Press 3: Search for hero
                    Press 4: Edit a hero
                    Press 5: Delete a hero
                    Press 9: Exit""");

            brugervalg = validateInt();
            scanner.nextLine();
            if (brugervalg == 1) {

                System.out.println("Enter the name of ur superhero");
                String reader1 = scanner.nextLine();
                System.out.println("Enter the superheroes real name");
                String reader2 = scanner.nextLine();
                System.out.println("Enter the superheroes superpower");
                String reader3 = scanner.nextLine();


                heroDatabase.addSuperhero(reader1, reader2, reader3);
            } else if (brugervalg == 2) {
                System.out.println(heroDatabase.getSuperheroes());
            } else if (brugervalg == 3) {
                System.out.println("Insert the name of you superhero");
                String heroName = scanner.nextLine();
                chooseSuperhero(heroDatabase.findSuperHero(heroName));

            } else if (brugervalg == 4) {
                System.out.println("Which superhero do you want to edit?");
                String heroName = scanner.nextLine();
                editHero(chooseSuperhero(heroDatabase.findSuperHero(heroName)));

            }
            else if (brugervalg == 5){
                deleteHero();
            }
            else {System.exit(0);
            }


        } while (brugervalg != 9);

    }
     public int validateInt(){
       while (!scanner.hasNextInt()){
          System.out.println("Please choose one of the numbers above");
          scanner.next();
       }
      return scanner.nextInt();
    }

    public Superhero chooseSuperhero(ArrayList<Superhero> heroList) {
        if (heroList.size() != 0) {
            if (heroList.size() == 1) {
                return heroList.get(0);
            } else {
                for (int i = 0; i < heroList.size(); i++) {
                    System.out.printf("%s: %s, %s\n", i, heroList.get(i).getSuperHeroName(), heroList.get(i).getRealName());
                }
                while (true) {
                    int heroNumber = scanner.nextInt();
                    if (heroNumber < heroList.size() && heroNumber >= 0) {
                        System.out.println(heroList.get(heroNumber));
                        return heroList.get(heroNumber);
                    } else {
                        System.out.println("Please enter a number between 0 and" + (heroList.size() - 1));
                    }
                }
            }
        } else {
            System.out.println("No superhero was found");
            return null;

        }
    }

    public void editHero(Superhero editSuperhero) {
        System.out.println("Edit Superhero:" + editSuperhero);

        System.out.println("Press enter to edit a superhero");
        System.out.println("Superhero name" + editSuperhero.getSuperHeroName());
        String newSuperheroName = scanner.nextLine();
        if (!newSuperheroName.isEmpty()) {
            editSuperhero.setSuperHeroName(newSuperheroName);
        }
        System.out.println("Superhero Real name" + " " + editSuperhero.getRealName());
        String newRealName = scanner.nextLine();
        if (!newRealName.isEmpty()) {
            editSuperhero.setRealName(newRealName);

            System.out.println("Superpower" + " " + editSuperhero.getSuperPower());
            String newSuperPower = scanner.nextLine();
            if (!newSuperPower.isEmpty()) {
                editSuperhero.setSuperPower(newSuperPower);

            }
        }
    }

    public void deleteHero() {
        for (int i = 0; i <heroDatabase.getSize() ; i++) {
            System.out.println(i + 1 + " " + heroDatabase.getSuperheroes().get(i).getSuperHeroName());
        }
        int searchForHero = scanner.nextInt()-1;
        scanner.nextLine();
        boolean isDeleted = heroDatabase.deleteHero(heroDatabase.getSuperheroes().get(searchForHero));
        if (isDeleted){
            System.out.println("The superhero has been deleted");
        }
        else {
            System.out.println("The superhero couldn't be deleted");
        }
    }
}

    

