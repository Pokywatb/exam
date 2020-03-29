public class Farm {

    public FarmAnimal[] farmanimals = new FarmAnimal[10];
    public WildAnimal[] wildAnimals = new WildAnimal[3];

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

    public void passDay(FarmAnimal farmAnimal, WildAnimal wildAnimal, Farmer farmer) {

        farmer.spend();
        if (farmer.getResources() < 1) {
            System.out.println("Game Over");
        } else {
            farmer.kickOut(wildAnimal, farmAnimal, wildAnimals, farmanimals);
            farmer.feed(farmAnimal);
            farmer.collectRes(farmanimals);
        }
        System.out.println("");
    }
}

