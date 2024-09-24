public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Félins", "Simba", 5, true);
        lion.displayAnimal();

        Zoo myZoo = new Zoo("Central Park Zoo", "Madagascar");
        myZoo.displayZoo();

        myZoo.addAnimal(lion);
        Animal lion2 = new Animal("Félins", "syrine", 5, true);
        myZoo.addAnimal(lion2);

        System.out.println("Is the zoo full? " + myZoo.isZooFull());

        myZoo.ShowAnimals();

        System.out.println("Index of lion: " + myZoo.searchAnimal(lion));
        System.out.println("Index of lion2: " + myZoo.searchAnimal(lion2));

        Zoo anotherZoo = new Zoo("Safari Park", "Africa");
        anotherZoo.addAnimal(new Animal("Félins", "Leo", 4, true));
        Zoo largerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        System.out.println("The zoo with more animals is: " + largerZoo.name);
    }
}
