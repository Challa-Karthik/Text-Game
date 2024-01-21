import java.util.Scanner;

public class  Game{

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        System.out.println("Welcome to the Movie Adventure Game!");
        System.out.println("You find an old board game named 'CineJungle.'");
        System.out.println("As you start playing, you are transported into different movie worlds!");

        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\n\nChoose a movie world to enter:");
                System.out.println("1. Jurassic Park");
                System.out.println("2. Pirates of the Caribbean");
                System.out.println("3. Quit\n\n");

                int choice = getUserChoice(scanner, 3);

                switch (choice) {
                    case 1:
                        System.out.println("Welcome to Jurassic Park Adventure!");
                        System.out
                                .println("You find yourself in a dense jungle surrounded by the sounds of dinosaurs.");

                        try {
                            System.out.println("\nChoose your first move:");
                            System.out.println("1. Walk towards the clearing");
                            System.out.println("2. Climb a tree for a better view");
                            System.out.println("3. Stay put and observe\n");

                            int ch = getUserChoice(scanner, 3);

                            switch (ch) {
                                case 1:
                                    System.out.println(
                                            "As you walk towards the clearing, you encounter a friendly herbivorous dinosaur.");
                                    System.out.println("It nudges you gently and moves away. What will you do next?");
                                    break;
                                case 2:
                                    System.out.println("You climb a tree and spot a pack of velociraptors below.");
                                    System.out.println("They haven't noticed you yet. What will you do next?");
                                    break;
                                case 3:
                                    System.out.println(
                                            "You stay put and observe the surroundings. Suddenly, you hear a distant roar.");
                                    System.out.println("It's a T-Rex! What will you do next?");
                                    break;
                            }
                            System.out.println("\nChoose your next move:");
                            System.out.println("1. Approach the herbivorous dinosaur");
                            System.out.println("2. Stay hidden in the tree");
                            System.out.println("3. Run away from the T-Rex\n");

                            ch = getUserChoice(scanner, 3);

                            switch (ch) {
                                case 1:
                                    System.out.println("Approaching the herbivorous dinosaur, you gain its trust.");
                                    System.out.println("It becomes your companion on this Jurassic adventure!");
                                    break;
                                case 2:
                                    System.out.println(
                                            "You decide to stay hidden in the tree as the velociraptors pass by.");
                                    System.out.println("They eventually move away, and you climb down safely.");
                                    break;
                                case 3:
                                    System.out.println(
                                            "Running away from the T-Rex, you find a hidden cave to take shelter.");
                                    System.out.println(
                                            "It seems safe for now, but you're deep in the heart of Jurassic Park.");
                                    break;
                            }

                            System.out.println(
                                    "\n---------Congratulations! You survived your Jurassic Park adventure.---------------");
                        } finally {
                            System.out.println(
                                    "***************************************************************************************");

                        }

                        break;
                    case 2:
                        System.out.println("\nWelcome to Pirates of the Caribbean Adventure!");
                        System.out.println("You find yourself on a mysterious pirate ship sailing the open seas.\n");

                        try {
                            System.out.println("\nChoose your first move:");
                            System.out.println("1. Explore below deck");
                            System.out.println("2. Climb the mast for a better view");
                            System.out.println("3. Join the crew in a sea shanty\n");

                            int chance = getUserChoice(scanner, 3);

                            switch (chance) {
                                case 1:
                                    System.out.println("As you explore below deck, you discover a treasure map.");
                                    System.out.println(
                                            "It marks the location of Captain Jack Sparrow's hidden treasure!");
                                    break;
                                case 2:
                                    System.out.println(
                                            "You climb the mast and spot a distant island with a skull-shaped rock.");
                                    System.out.println("It seems like the perfect place for hidden pirate treasure.");
                                    break;
                                case 3:
                                    System.out.println(
                                            "Joining the crew in a sea shanty, you learn about a legendary pirate curse.");
                                    System.out.println(
                                            "The crew believes the treasure can break the curse. What will you do next?");
                                    break;
                            }

                            System.out.println("\nChoose your next move:");
                            System.out.println("1. Follow the treasure map");
                            System.out.println("2. Sail towards the island with the skull-shaped rock");
                            System.out.println("3. Investigate more about the pirate curse\n");

                            chance = getUserChoice(scanner, 3);

                            switch (chance) {
                                case 1:
                                    System.out.println(
                                            "Following the treasure map, you embark on an epic quest to find Captain Jack's treasure.");
                                    System.out.println(
                                            "The journey is full of challenges and encounters with other pirates.");
                                    break;
                                case 2:
                                    System.out.println(
                                            "Sailing towards the island, you face treacherous waters and fierce sea creatures.");
                                    System.out.println("However, the allure of pirate treasure keeps you determined.");
                                    break;
                                case 3:
                                    System.out.println(
                                            "Investigating more about the pirate curse, you discover a way to break it.");
                                    System.out.println("This knowledge may prove valuable on your pirate adventure.");
                                    break;
                            }

                            System.out.println(
                                    "\n\nCongratulations! You have successfully navigated the Pirates of the Caribbean Adventure.");

                        } finally {
                            System.out.println(
                                    "***************************************************************************************");

                        }
                        break;
                    case 3:
                        System.out.println("Thanks for playing! Goodbye.");
                        return;
                }
            }
        } finally {
            scanner.close();
        }
    }

    public static int getUserChoice(Scanner scanner, int maxChoice) {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice >= 1 && choice <= maxChoice) {
                    return choice;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and " + maxChoice + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
