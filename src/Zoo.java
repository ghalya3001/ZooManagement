public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages;
    int i;

    public Zoo(String name, String city) {
        this.nbrCages = 25;
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.i = 0;
    }

    public void displayZoo() {
        System.out.println(this.name);
        System.out.println(this.city);
        System.out.println(this.nbrCages);

    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal)==-1 && i<nbrCages){

            animals[i] = animal;
            i++;
            return true;
        }
        return false;
    }

    void ShowAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);}
        }


    }

    int searchAnimal(Animal animal) {

        for (int j = 0; j < i; j++) {
            if (animals[j] != null && animals[j].name.equals(animal.name)) {
                return j;
            }
        }
        return -1;
    }
    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        animals[index] = null;
        return true;
    }

    public boolean isZooFull() {
        return i >= nbrCages;
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.i >= z2.i ? z1 : z2;
    }
}