//package com.company;
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
        boolean lootOrMonster = random.nextBoolean();
        if (lootOrMonster) {
            //monster attack
            System.out.println("You just encountered a" + monsterType);
            System.out.println("A " + monsterType + " has " + monsterHealth + " health and does " + monsterDamage + " damage.");
            System.out.print("Press 1 to attack or 2 to run.");
            int attackOrRun = scanner.nextInt();
            if (attackOrRun == 1) {
                System.out.println("You've chosen to attack");
            }
            else {

            }
        }
        else {
            //loot

        }
    }

    public boolean Visited() {
        return GetVisited();
    }

}
