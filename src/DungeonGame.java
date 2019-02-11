import java.util.Scanner;

public class DungeonGame {
    private DungeonMap map;
    private Player player;
    Scanner scanner = new Scanner(System.in);

    public void play() {
        introPrint();
        classSelect();
        int rowCount = 10;
        int colCount = 10;
        map = new DungeonMap(rowCount,colCount, player);
        while (player.getGold() < 100 && player.getHealth() > 0) {
            System.out.println("=================================================");
            System.out.println(" ");
            map.print();
            System.out.println("GP = " + player.getGold());
            System.out.println("HP = " + player.getHealth());
            playerMovement(rowCount, colCount);
            System.out.println("You open a door and move through ...");
            System.out.println(" ");
            map.enterRoom(player);
        }
        endPrint();
    }

    private void classSelect() {
            System.out.println("Select your class:");
            System.out.println("[1] Warrior");
            System.out.println("[2] Thief");
            System.out.print("==> ");
            int playerChoice = scanner.nextInt();
            if (playerChoice == 1) {
                player = new Player(100,0,15,"Warrior",1);
            }
            else if (playerChoice == 2) {
                player = new Player(70,0,10,"Thief",1.2);
            }
            System.out.println(" ");
    }

    private void introPrint() {
        System.out.println("=================================================");
        System.out.println("You are in a dungeon!");
        System.out.println("There are monster, gold, and health potions in each room.");
        System.out.println("Are you a bad enough dude to find 100 gold and pay your way out of the dungeon before you're killed?");
        System.out.println(" ");
    }

    private void endPrint() {
        if (player.getHealth() <= 0) {
            System.out.println("You die of your wounds, eternally lost within the dungeon and cursed to torment whatever unlucky soul next finds their way here.");
        }
        else if (player.getGold() >= 100) {
            System.out.println("The wizard, sensing that you have sufficient funds, creates a portal in front of you while magically stealing 100 gold pieces from your bag");
            System.out.println("Stepping through the portal you find yourself at home, you can rest at ease now.");
        }
    }

    private void playerMovement(int pRowCount, int pColCount) {
        boolean running = true;

        while (running == true) {
            System.out.println(" ");
            System.out.print("Select a door: [W] up, [S] down, [A] left, [D] right ==> ");
            String input = scanner.next();
            if (input.toLowerCase().equals("w")) {

                if (player.getXCoord()-1 >= 0 && player.getXCoord()-1 < pColCount) {
                    player.setXCoord(player.getXCoord()-1);
                    running = false;
                }
                else {
                    System.out.println("There is a wall blocking that direction!");
                }
            }
            else if (input.toLowerCase().equals("a")) {
                if (player.getYCoord()-1 >= 0 && player.getYCoord()-1 < pRowCount) {
                    player.setYCoord(player.getYCoord()-1);
                    running = false;
                }
                else {
                    System.out.println("There is a wall blocking that direction!");
                }
            }
            else if (input.toLowerCase().equals("s")) {
                if (player.getXCoord()+1 >= 0 && player.getXCoord()+1 < pRowCount) {
                    player.setXCoord(player.getXCoord()+1);
                    running = false;
                }
                else {
                    System.out.println("There is a wall blocking that direction!");
                }
            }
            else if (input.toLowerCase().equals("d")) {
                if (player.getYCoord()+1 >= 0 && player.getYCoord()+1 < pColCount) {
                    player.setYCoord(player.getYCoord()+1);
                    running = false;
                }
                else {
                    System.out.println("There is a wall blocking that direction!");
                }
            }
            else {
                System.out.println("please enter a proper input");
            }
        }
    }
}