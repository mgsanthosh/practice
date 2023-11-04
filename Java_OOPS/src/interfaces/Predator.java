package interfaces;

public interface Predator {
    /*
    @author santhosh
    we can’t change the value of an interface field because interface fields are final and static by default.
     */
    String name = "PREDATOR";

    void hunt();
}
