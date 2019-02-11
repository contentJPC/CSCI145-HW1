import java.util.Random;

public class Monster {
    private int health;
    private int damage;
    private String monsterType;

    public Monster(int health, String monsterType) {
        this.health = health;
        this.monsterType = monsterType;
        damage = 10;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int pHealth) {
        health = pHealth;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int pDamage) {
        damage = pDamage;
    }

    public String getMonsterType() {
        return monsterType;
    }
    public void setMonsterType(String pMonsterType) {
        monsterType = pMonsterType;
    }


    public void attack(Player pPlayer) {
        System.out.println(monsterType + "attacks for " + damage);

        pPlayer.onHit(damage);

    }

    public void onHit(int pDamage) {
        health = health - damage;

        if (health <= 0) {
            System.out.println("You have slain the " + monsterType);
        }
    }
    public int
}