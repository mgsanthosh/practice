package AdvancedInterfaces;

public class Sudoku implements Game {
    @Override
    public void play() {
        System.out.println("Playing Sudoku");
    }


    @Override
    public void addedSuccessfully() {
        System.out.println("Added Sudoku");

    }
}
