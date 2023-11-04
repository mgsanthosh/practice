package interfaces;

import static interfaces.Predator.name;

public class Fish implements Prey, Predator{

    @Override
    public void hunt() {
                /*
        @Author Santhosh
        We Can call things which are static  without creating an object of the class
        which is implementing this interface

        Since there are names in both the interfaces we have to specify which interface should it display
         */
        System.out.println("NAME = " + Predator.name);
        System.out.println("THE FISH is HUNTING");
    }

    @Override
    public void flee() {
                        /*
        @Author Santhosh
        We Can call things which are static  without creating an object of the class
        which is implementing this interface

        Since there are names in both the interfaces we have to specify which interface should it display
         */
        System.out.println("NAME = " + Prey.name);
        System.out.println("THE FISH is FLEEING");

    }
}
