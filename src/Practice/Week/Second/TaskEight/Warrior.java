package Practice.Week.Second.TaskEight;

public class Warrior extends Player{
    String armor;

    public Warrior(int hp, int level, String type, String weapon, String armor) {
        super(hp, level, type, weapon);
        this.armor = armor;
    }

    @Override
    public String getFullInfo() {
        return hp + " " + level + " " + type + " " + weapon + " " + armor;
    }

    @Override
    public void levelUp() {
        level = level + 1;
    }

    @Override
    public boolean doDamage() {
        return true;
    }
}
