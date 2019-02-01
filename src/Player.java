/**
 * Created by cormiej on 1/23/19.
 */
public class Player {
    private int health = 0;
    private int gold = 0;
    private int damage = 0;
    private String playerClass = "Mage";
    private double lootModifier = 1.0;

    //gets and sets
    private int getHealth() {
        return this.health;
    }
    private void setHealth(int pHealth) {
        this.health = pHealth;
    }

    private int getGold() {
        return this.gold;
    }
    private void setGold(int pGold) {
        this.gold = pGold;
    }

    private int getDamage() {
        return this.damage;
    }
    private void setDamage(int pDamage) {
        this.damage = pDamage;
    }

    private String getPlayerClass() {
        return this.playerClass;
    }
    private void setPlayerClass(String pPlayerClass) {
        this.playerClass = pPlayerClass;
    }

    private double getLootModifieretLootModifier() {
        return this.lootModifier;
    }
    private void setLootModifier(double pLootModifier) {
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
