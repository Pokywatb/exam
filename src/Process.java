public class Process {
    public static void main(String[] args) {
        Farm farm = new Farm();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Bear bear = new Bear();
        Cow cow = new Cow();
        Cow cow2 = new Cow();
        Cow cow3 = new Cow();
        Cat cat = new Cat();
        Chicken chicken = new Chicken();
        Rabbit rabbit = new Rabbit();
        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Farmer farmer = new Farmer();

        farm.addWildAnimal(wolf);
        farm.addWildAnimal(fox);
        farm.addWildAnimal(bear);
        farm.addFarmAnimal(cat);
        farm.addFarmAnimal(chicken);
        farm.addFarmAnimal(chicken1);
        farm.addFarmAnimal(chicken2);
        farm.addFarmAnimal(cow);
        farm.addFarmAnimal(cow2);
        farm.addFarmAnimal(cow3);
        farm.addFarmAnimal(rabbit);
        farm.addFarmAnimal(rabbit1);
        farm.addFarmAnimal(rabbit2);


        farm.passDay();// понимаю в чем ошибка но не могу найти.

    }
}
