import java.util.Scanner;

public class UserInterface{
    public void startProgram() {

    Scanner scanner = new Scanner(System.in);
    Database heroDatabase = new Database();
    int brugervalg = 0;
    do {
        System.out.println("""
                Welcome to my superhero universe.
                Press 1: Create Hero
                Press 2: Show list of superheroes
                Press 3: Search for hero
                Press 4: Exit""");

        brugervalg = scanner.nextInt();
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
            heroDatabase.findSuperHero(heroName);
        } else {
            System.exit(0);
        }

    } while (brugervalg != 4);
    public void
}
    }

