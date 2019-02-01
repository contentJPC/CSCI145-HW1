public class Player {
    private int health = 0;
    private int gold = 0;
    private int damage = 0;
    private String playerClass = "Mage";
    private double lootModifier = 1.0;

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
    public void Player(int pHealth, int pGold, int pDamage, String pPlayerClass, double pLootModifier) {
        setHealth(pHealth);
        setGold(pGold);
        setDamage(pDamage);
        setPlayerClass(pPlayerClass);
        setLootModifier(pLootModifier);
    }



    public void attack(Monster pMonster) {

    }
    public void onHit(int pDamage) {

    }
    public void onHeal(int pHeal) {

    }
    public void onLoot(int pGold) {

    }
}
