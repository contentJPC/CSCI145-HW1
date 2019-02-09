import java.util.Random;
import java.util.Scanner;

public class Room {
    private boolean Visited;

    public boolean GetVisited() {
        return this.Visited;
    }

    public void SetVisited(boolean pVisited) {
        Visited = pVisited;
    }

    public void Enter(Player pPlayer) {
        SetVisited( true);
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Monster monster = new Monster();
        String monsterType = monster.getMonsterType();
        int monsterDamage = monster.getDamage();
        int monsterHealth = monster.getHealth();

        Player player = new Player(1, 1, 1, "Unset", 1);
        String playerClass = player.getPlayerClass();
        int playerHealth = player.getHealth();
        int playerDamage = player.getDamage();
        int playerGold = player.getGold();
        double playerLootModifier = player.getLootModifieretLootModifier();

        boolean lootOrMonster = random.nextBoolean();
        while (monsterHealth > 0) {
            if (lootOrMonster) {
                //monster attack
                System.out.println("You just encountered a" + monsterType);
                System.out.print(" that has " + monsterHealth + " health and does " + monsterDamage + " damage.");
                System.out.println();
                System.out.print("Press 1 to attack or 2 to run.");
                int attackOrRun = scanner.nextInt();

                if (attackOrRun == 1) {
                        System.out.println("You've chosen to attack");
                        playerHealth = playerHealth - monsterDamage;
                        System.out.println("The " + monsterType + " did " + monsterDamage);
                        monsterHealth = monsterHealth - playerDamage;
                        System.out.println("You did " + playerDamage + " damage to the " + monster);
                }

                else if (attackOrRun == 2) {
                    playerHealth = playerHealth - monsterDamage;
                    System.out.println("You've chosen to run");
                    break;
                }
            }

            else {
                //loot

            }
        }
    }



    public boolean Visited() {
        return GetVisited();
    }

}
