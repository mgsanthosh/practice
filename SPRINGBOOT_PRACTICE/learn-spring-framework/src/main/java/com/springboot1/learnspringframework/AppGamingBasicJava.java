package com.springboot1.learnspringframework;

import ch.qos.logback.core.status.OnConsoleStatusListener;
import com.springboot1.learnspringframework.game.GameRunner;
import com.springboot1.learnspringframework.game.MarioGame;
import com.springboot1.learnspringframework.game.PacMan;
import com.springboot1.learnspringframework.game.SuperContraGame;

import java.util.*;

public class AppGamingBasicJava {

    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacMan();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
