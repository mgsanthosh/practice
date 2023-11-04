package interfaces;

public class Main {

    public static void main(String[] args) {

        /*
        @Author Santhosh

        There are two ways how we can call
         */
        Prey pr = new Rabbit();
        pr.flee();

        Rabbit rabbit = new Rabbit();
        rabbit.flee();


        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

        Hawk hawk = new Hawk();
        hawk.hunt();

    }

}
