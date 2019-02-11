import java.util.Scanner;

public class DungeonGame {
    private DungeonMap map;
    private Player player = new Player(1, 1, 1, "Unset", 1);
    Scanner scanner = new Scanner(System.in);

    public void play() {
        map = new DungeonMap(10,10);
        System.out.println("=================================================");
        System.out.println("You are in a dungeon!");
        System.out.println("There are monster, gold, and health potions in each room.");
        System.out.println("Are you a bad enough dude to find 100 gold and pay your way out of the dungeon before you're killed?");
        System.out.println(" ");
        classSelect();
        while (player.getGold() < 100 && player.getHealth() > 0) {
            System.out.println("=================================================");
            System.out.println(" ");
            map.print();
            System.out.println("GP = " + player.getGold());
            System.out.println("HP = " + player.getHealth());
            //get input
            boolean running = true;
            while (running == true) {
                System.out.println(" ");
                System.out.println("Select a door: [W] up, [S] down, [A] left, [D] right ==> ");
                String input = scanner.next();
                if (input.toLowerCase().equals("w")) {
                    player.setXCoord(player.getXCoord()+1);
                    running = false;
                }
                else if (input.toLowerCase().equals("a")) {
                    player.setXCoord(player.getXCoord()-1);
                    running = false;
                }
                else if (input.toLowerCase().equals("s")) {
                    player.setYCoord(player.getYCoord()-1);
                    running = false;
                }
                else if (input.toLowerCase().equals("d")) {
                    player.setYCoord(player.getYCoord()+1);
                    running = false;
                }
                else {
                    System.out.println("please enter a proper input");
                }
            }
            System.out.println("You open a door and move through ...");
            System.out.println("");
            //encounter message
            //encounter, give player options if combat
            //int freeze = scanner.nextInt();
        }
    }

    public void classSelect() {
            System.out.println("Select your class:");
            System.out.println("[1] Warrior");
            System.out.println("[2] Thief");
            System.out.print("==> ");
            int playerChoice = scanner.nextInt();
            if (playerChoice == 1) {
                this.player.setHealth(100);
                this.player.setGold(0);
                this.player.setDamage(15);
                this.player.setPlayerClass("Warrior");
                this.player.setLootModifier(1);
                this.player.setXCoord(0);
                this.player.setYCoord(0);
            }
            else if (playerChoice == 2) {
                this.player.setHealth(70);
                this.player.setGold(0);
                this.player.setDamage(10);
                this.player.setPlayerClass("Thief");
                this.player.setLootModifier(1.2);
                this.player.setXCoord(0);
                this.player.setYCoord(0);
            }
            System.out.println(" ");
    }
}