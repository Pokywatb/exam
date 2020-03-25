public class FarmAnimal extends Animal implements CanRun, CanHeal {

        private int resPerCycle = 0;
    private final int initialHealth = (int) (Math.random()*8);
    private int health = initialHealth ;
    protected boolean onFarm = true;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getResPerCycle() {
        return resPerCycle;
    }

    public void setResPerCycle(int resPerCycle) {
        this.resPerCycle = resPerCycle;
    }

    @Override
    public void run(WildAnimal wildAnimal) {
        if (wildAnimal.getSpeed() > getSpeed()) {
            setHealth(health - wildAnimal.getStrength());
        }
        if (health < 1){
            onFarm = false;
            System.out.println("Животное убили");
        }

    }

    public int getInitialHealth() {
        return initialHealth;
    }

    @Override
    public void heal() {
        health += 1;
    }
}
