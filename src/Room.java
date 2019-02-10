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
        SetVisited(true);
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
                    //attack
                    System.out.println("You've chosen to attack");
                    playerHealth = playerHealth - monsterDamage;
                    System.out.println("The " + monsterType + " did " + monsterDamage);
                    monsterHealth = monsterHealth - playerDamage;
                    System.out.println("You did " + playerDamage + " damage to the " + monster);
                } else if (attackOrRun == 2) {
                    //run
                    playerHealth = playerHealth - monsterDamage;
                    System.out.println("You've chosen to run");
                    System.out.println("You lost " + monsterDamage + "health");
                    break;
                }
            }

            else {
                boolean goldOrHealing = random.nextBoolean();
                if (goldOrHealing) {
                    //pick up gold
                    int amountOfGold = random.nextInt(15);
                    playerGold = playerGold + amountOfGold;
                    System.out.println("You picked up " + amountOfGold + " gold!");
                } else {
                    //gain health
                    int amountOfHealth = random.nextInt(15);
                    if (playerClass.equals("Warrior")) {
                        if (playerHealth + amountOfHealth < 100) {
                            //if total player hp < max
                            playerHealth = playerHealth + amountOfHealth;
                        }

                        else if (playerHealth + amountOfHealth > 100) {
                            //if total player hp > max
                            playerHealth = 100;
                        }

                        else if (playerClass.equals("Thief")) {
                            if (playerHealth + amountOfHealth < 70) {
                                //if total player hp < max
                                playerHealth = playerHealth + amountOfHealth;
                            }

                            else if (playerHealth + amountOfHealth > 70) {
                                //if total player hp > max
                                playerHealth = 70;
                            }

                        }
                    }
                }
            }
        }

        public boolean hasVisited() {
            return GetVisited();
        }
    }
}
