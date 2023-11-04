package AdvancedInterfaces;

import java.util.ArrayList;
import java.util.List;

public class GamingConsole<T extends Game> {
    private List<T> games;

    public GamingConsole() {
        games = new ArrayList<>();
    }

    public void addGame(T game) {
        games.add(game);
        game.addedSuccessfully();
    }

    public void playAllGames() {
        for(T game : games) {
            game.play();
        }
    }
}
