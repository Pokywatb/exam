public class WildAnimal extends Animal{

    private int strength;
    private int kickCount = 0;
    protected boolean inForest = true;

    public int getKickCount() {
        return kickCount;
    }

    public void setKickCount(int kickCount) {
        this.kickCount = kickCount;
    }

    public boolean isInForest() {
        return inForest;
    }

    public void setInForest(boolean inForest) {
        this.inForest = inForest;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
