package Practice.Week.Second.TaskEight;

public class Wizard extends Player{
    int manaLevel;
    String element;

    public Wizard(int hp, int level, String type, String weapon, int manaLevel, String element) {
        super(hp, level, type, weapon);
        this.manaLevel = manaLevel;
        this.element = element;
    }

    @Override
    public String getFullInfo() {
        return hp + " " + level + " " + type + " " + weapon + " " + manaLevel + " " + element;
    }

    @Override
    public void levelUp() {
        level = level + 1;
    }

    @Override
    public boolean doDamage() {
        if (manaLevel >= 10) {
            manaLevel = manaLevel - 10;
            return true;
        } else return false;
    }
}
