import java.util.Random;
import java.util.Scanner;

public class Room {
    private boolean visited = false;

    public boolean getVisited() {
        return this.visited;
    }

    public void setVisited(boolean pVisited) {
        this.visited = pVisited;
    }

    public void enter(Player pPlayer) {
        setVisited(true);
        Random random = new Random();
        Player player = pPlayer;

        int randomEncounter = random.nextInt(3);
        System.out.println(randomEncounter);
        switch (randomEncounter) {
            case 0: combat(player);
            break;
            case 1: heal(player);
            break;
            case 2: gold(player);
            break;
        }
    }

    public boolean hasVisited() {
        return getVisited();
    }

    public void combat(Player pPlayer) {
        Scanner scanner = new Scanner(System.in);
        Monster monster = new Monster(500,1000,"Curious Test Subject");

        while (monster.getHealth() > 0) {
            //monster attack
            System.out.println("In front of you is a " + monster.getMonsterType() + " that has " + monster.getHealth() + " health and does " + monster.getDamage() + " damage");
            System.out.print("Press 1 to attack or 2 to run : ");
            int attackOrRun = scanner.nextInt();

            monster.attack(pPlayer);
            if (attackOrRun == 1) {
                //attack
                if (pPlayer.getHealth() <= 0) {
                    break;
                }
                pPlayer.attack(monster);
            } else if (attackOrRun == 2) {
                //run
                System.out.println("You escape the room, but were hit while your back was turned!");
                break;
            }
        }
    }

    public void heal(Player pPlayer) {
        //gain health
        Random random = new Random();
        int amountOfHealth = random.nextInt(15);
        pPlayer.onHeal(amountOfHealth);
    }

    public void gold(Player pPlayer) {
        Random random = new Random();
        int amountOfGold = random.nextInt(30);
        pPlayer.onLoot(amountOfGold);
    }
}
