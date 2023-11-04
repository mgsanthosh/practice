package interfaces;

public class Rabbit implements Prey{
    @Override
    public void flee() {
        /*
        @Author Santhosh
        We Can call things which are static  without creating an object of the class
        which is implementing this interface
         */
        System.out.println("NAME = " + name);
        System.out.println("THE RABBIT is FLEEING");
    }
}
