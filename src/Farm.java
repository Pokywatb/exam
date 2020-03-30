public class Farm {

    public FarmAnimal[] farmanimals = new FarmAnimal[10];
    public WildAnimal[] wildAnimals = new WildAnimal[3];
    private Farmer farmer;
    private FarmAnimal farmAnimal;
    private WildAnimal wildAnimal;

    public FarmAnimal[] getFarmanimals() {
        return farmanimals;
    }

    public void setFarmanimals(FarmAnimal[] farmanimals) {
        this.farmanimals = farmanimals;
    }

    public WildAnimal[] getWildAnimals() {
        return wildAnimals;
    }

    public void setWildAnimals(WildAnimal[] wildAnimals) {
        this.wildAnimals = wildAnimals;
    }

    public void passDay() {
        farmer.spend();
        if (farmer.getResources() < 1) {
            System.out.println("Game Over");
        } else {
            farmer.kickOut(wildAnimal, farmAnimal, wildAnimals, farmanimals);
            farmer.feed(farmAnimal);
            farmer.collectRes(farmanimals);
        }

    }

    public void addWildAnimal(WildAnimal wild) {
        for (int i = 0; i < wildAnimals.length; i++) {
            if (wildAnimals[i] == null) {
                wildAnimals[i] = wild;
            }
        }
    }

    public void addFarmAnimal(FarmAnimal farm) {
        for (int i = 0; i < farmanimals.length; i++) {
            if (farmanimals[i] == null) {
                farmanimals[i] = farm;
            }
        }
    }
}

