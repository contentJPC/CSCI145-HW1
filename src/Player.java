public class Player {
    private int health;
    private int gold;
    private int damage;
    private String playerClass;
    private double lootModifier;

    //gets and sets
    public int getHealth() {
        return this.health;
    }
    public void setHealth(int pHealth) {
        this.health = pHealth;
    }

    public int getGold() {
        return this.gold;
    }
    public void setGold(int pGold) {
        this.gold = pGold;
    }

    public int getDamage() {
        return this.damage;
    }
    public void setDamage(int pDamage) {
        this.damage = pDamage;
    }

    public String getPlayerClass() {
        return this.playerClass;
    }
    public void setPlayerClass(String pPlayerClass) {
        this.playerClass = pPlayerClass;
    }

    public double getLootModifieretLootModifier() {
        return this.lootModifier;
    }
    public void setLootModifier(double pLootModifier) {
        this.lootModifier = pLootModifier;
    }

    //Constructor, no empty one needed because player can only start with 1 of 2
    //stat options which will be fed into the constructor on character creation
    public Player(int pHealth, int pGold, int pDamage, String pPlayerClass, double pLootModifier) {
        setHealth(pHealth);
        setGold(pGold);
        setDamage(pDamage);
        setPlayerClass(pPlayerClass);
        setLootModifier(pLootModifier);
    }

    public void attack(Monster pMonster) {
        //hitting the monster, call for monster's onHit
    }
    public void onHit(int pDamage) {
        //getting hit, lower health and check if health is below 0
        health = health - damage();

        if (health <= 0) {
            System.out.println("YOU ARE DEAD");
        }
    }
    public void onHeal(int pHeal) {
        //increase health
    }
    public void onLoot(int pGold) {
        //increase gold, check if gold is above 100
    }
}