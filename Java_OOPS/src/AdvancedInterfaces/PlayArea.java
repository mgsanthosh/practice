package AdvancedInterfaces;

public class PlayArea {

    public static void main(String[] args) {
        GamingConsole<Game> gamingConsole = new GamingConsole<>();
        gamingConsole.addGame(new Chess());
        gamingConsole.addGame(new Sudoku());
        gamingConsole.playAllGames();
    }
}
