import java.util.Random;

public class Monster {
    private int health = 0;
    private int damage = 0;
    private String monsterType = "name";

    public int getHealth() {
        return this.health;
    }
    public void setHealth(int pHealth) {
        this.health = pHealth;
    }

    public int getDamage() {
        return this.damage;
    }
    public void setDamage(int pDamage) {
        this.damage = pDamage;
    }

    public String getMonsterType() {
        return this.monsterType;
    }
    public void setMonsterType(String pMonsterType) {
        this.monsterType = pMonsterType;
    }

    public Monster(int pHealth, int pDamage, String pName) {
        setHealth(pHealth);
        setDamage(pDamage);
        setMonsterType(pName);
    }

    public void attack(Player pPlayer) {
        Random random = new Random();
        int randomDamage = random.nextInt(damage);
        pPlayer.onHit(randomDamage);
        System.out.println("The " + monsterType + " attacks for " + randomDamage + " damage");
    }

    public void onHit(int pDamage) {
        health = health - pDamage;

        if (health <= 0) {
            System.out.println(monsterType + " has died");
        }
    }
}