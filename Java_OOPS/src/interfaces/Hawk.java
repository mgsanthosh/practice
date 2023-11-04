package interfaces;

public class Hawk implements Predator{
    @Override
    public void hunt() {
        /*
        @Author Santhosh
        We Can call things which are static  without creating an object of the class
        which is implementing this interface
         */
        System.out.println("NAME = " + name);
        System.out.println("THE HAWK is HUNTING");
    }

}
