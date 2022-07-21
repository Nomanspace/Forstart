package Practice.Week.First.MediumTask;

import java.util.Objects;

public class Mage {
    String name;
    int level;
    int damage;
    String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

   /* String getInfo(String name, int level, int damage, String type) {
        return "Mage name " + name + " mage lvl " + level + " mage damage " + damage + " type of magic ";
    }*/

    String getInfo(Mage mage) {
        return "Mage name " + mage.name + " mage lvl " + mage.level + " mage damage " + mage.damage + " type of magic " + mage.type;
    }

    String fight(Mage opponent) {
        String winnedMage = "";
        if (this.type.equals("fire") && opponent.type.equals("ice")) {
            winnedMage = this.name;
        } else if (this.type.equals("fire") && opponent.type.equals("earth")) {
            winnedMage = opponent.name;
        } else if (this.type.equals("ice") && opponent.type.equals("fire")) {
            winnedMage = opponent.name;
        } else if (this.type.equals("ice") && opponent.type.equals("earth")) {
            winnedMage = this.name;
        } else if (this.type.equals("earth") && opponent.type.equals("fire")) {
            winnedMage = this.name;
        } else if (this.type.equals("earth") && opponent.type.equals("ice")) {
            winnedMage = opponent.name;
        } else if (this.type.equals(opponent.type)) {
            if(this.level > opponent.level) {
                winnedMage = this.name;
            } else if (this.level < opponent.level) {
                winnedMage = opponent.name;
            }else {
                if (this.damage > opponent.damage) {
                    winnedMage = this.name;
                } else if (this.damage < opponent.damage) {
                    winnedMage = opponent.name;
                }else return "draw";
            }
        }
        return winnedMage;
    }

    public static void main(String[] args) {
        //Object mage = new Object();
        Mage fireMage = new Mage("Fire mage", 1, 1, "fire");
        Mage iceMage = new Mage("Ice mage", 2, 2, "ice");
        Mage earthMage = new Mage("Earth mage", 3, 3, "earth");
        //System.out.println(this.getInfo(earth));
        //fireMage.fight(fireMage,iceMage);
        System.out.println(fireMage.fight(fireMage));

    }
}
