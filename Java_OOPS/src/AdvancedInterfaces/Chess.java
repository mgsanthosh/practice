package AdvancedInterfaces;

public class Chess implements Game {
    @Override
    public void play() {
        System.out.println("Playing Chess");
    }

    @Override
    public void addedSuccessfully() {
        System.out.println("Added Chess");

    }
}
