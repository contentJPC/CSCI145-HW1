/**
 * Created by cormiej on 1/23/19.
 */
public class Monster {
    private int health = 0;
    private int damage = 0;
    private String monsterType = "name";

    private int getHealth() {
        return this.health;
    }
    private void setHealth(int pHealth) {
        this.health = pHealth;
    }

    private int getDamage() {
        return this.damage;
    }
    private void setDamage(int pDamage) {
        this.damage = pDamage;
    }

    private String getMonsterType() {
        return this.monsterType;
    }
    private void setMonsterType(String pMonsterType) {
        this.monsterType = pMonsterType;
    }


    public void attack(Player pPlayer) {

    }
}
