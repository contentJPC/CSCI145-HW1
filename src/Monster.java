/**
 * Created by cormiej on 1/23/19.
 */
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


    public void attack(Player pPlayer) {

    }
}
