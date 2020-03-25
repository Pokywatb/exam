public class Farmer {

    private int resources = 5;

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }


    public void collectRes(FarmAnimal[] farmanimals) {
        for (FarmAnimal animal : farmanimals) {
            if (animal instanceof CanGiveResources) {
                resources += animal.getResPerCycle();

            } else {
                resources += animal.getWeight();
                animal = null;
                break;
            }
        }
    }

    public void feed(FarmAnimal animal){
        while (animal.getHealth() < animal.getInitialHealth()){
            animal.heal();
            System.out.println("животное откормлено");
        }
    }


    public void kickOut(WildAnimal[] wAnimal, FarmAnimal[] fAnimal){
        if (Math.random()*7 > 3){
            System.out.println("");
        }
        else {
            W
        }
    }

}
