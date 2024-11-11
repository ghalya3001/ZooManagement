public class ZooManagement {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("entrer le nbr des cages");
//        int nbCages = sc.nextInt();
//        System.out.println("entrer le nom");
//        String zooName = sc.next();
//        System.out.println(zooName+" comporte "+nbCages+ "cages");
        Animal lion = new Animal();
        lion.isMammal=true;
        lion.nom="simba";
        lion.age=3;
        lion.family="lion";
        Zoo myZoo = new Zoo();
        myZoo.nbCages=30;
        myZoo.city="ariana";
        myZoo.name="myZoo";

        Animal dog = new Animal("chien","dog",3,true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
    }
}
    