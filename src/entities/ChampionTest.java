package entities;

public class ChampionTest {

    private String name;
    private int life;
    private int attack;
    private int armor;

    public ChampionTest() {
    }

    public ChampionTest(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void takeDamage(Champion other) {
        int damage;
        if (life > other.getArmor()) {
            damage = 1;
        } else {
            damage = other.getAttack() - other.getArmor();
        }
        life -= damage;
    }

    public String toString() {
        if (life <= 0) {
            return name
                    + ": 0 de vida (morreu)";
        } else {
            return name
                    + ": "
                    + life
                    + " de vida";
        }
    }
}
