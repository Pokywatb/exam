public class Farmer {

    private int resources = 5;

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }


    public void collectRes(FarmAnimal[] fArmanimals) {
        for (FarmAnimal animal : fArmanimals) {
            int sum = 0;
            if (animal.onFarm = true) {
            } else if (animal instanceof CanGiveResources) {
                resources += animal.getResPerCycle();
                sum ++;
            }
            else {
                if (sum > 0){break;}
                else {
                    if(animal instanceof CanBeEaten){
                        resources += animal.getWeight();
                        break;
                    }
                }
            }
        }
    }

    public void feed(FarmAnimal animal) {
        while (animal.getHealth() < animal.getInitialHealth()) {
            animal.heal();
            System.out.println("животное откормлено");
        }
    }


    public void kickOut(WildAnimal wildAnimal, FarmAnimal fAnimal, WildAnimal[] animal1, FarmAnimal[] animal2) {
        wildAnimal = animal1[(int) (Math.random() * animal1.length)];
        fAnimal = animal2[(int) (Math.random() * animal2.length)];
        if ((Math.random() * 7 > 3) && (wildAnimal.inForest = true) && (fAnimal.onFarm = true) && (wildAnimal.inForest = true)) {
            wildAnimal.setKickCount(wildAnimal.getKickCount() + 1);
            if (wildAnimal.getKickCount() > 2) {
                wildAnimal.inForest = false;
            }
            System.out.println("Фермер прогнал животное");
        } else {
            fAnimal.run(wildAnimal);
        }
    }

    public void spend() {
        resources -= 2;
    }
}


