public class Zoo {
    String name,city;
    int nbCages;
    Animal[] animals;
    public Zoo(){}
    public Zoo(String name,String city,int nbCages){
        this.name=name;
        this.city=city;
        animals = new Animal[nbCages];
    }
    public void displayZoo(){
        System.out.println("Name :"+name);
        System.out.println("City :"+city);
        System.out.println("Nombre des cages :"+nbCages);
    }

    public String toString()
    {
        return "Name : "+name+"\n"+"City :"+city+"\n"
                +"Nombre des cages "+nbCages;
    }
}
