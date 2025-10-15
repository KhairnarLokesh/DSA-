public class inter {
    public static void main(String[] args) {
        Beer b=new Beer();
        b.eat();
        b.run();
    }
}

interface Herbivore{
    void eat();
}
interface carnivore{
    void run();
}


class Beer implements  Herbivore,carnivore{

    public void eat(){
        System.out.println("beer eats nonveg");
    }
    public void run(){
        System.out.println(".(beer run)");
    }
    }


// class nonveg implements Herbivore{
//     public void eat(){
//         System.out.println("bear eat nonveg");
//     }
// }
 
// class veg implements Herbivore{
//     public void eat(){
//         System.out.println("bear also eat veg");
//     }
// }
 