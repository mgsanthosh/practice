package com.springboot1.learnspringframework.game;

public class PacMan implements GamingConsole {
    public void up() {
        System.out.println("PAC MAN JUMP");
    }

    public void down() {
        System.out.println("PAC MAN HOLE");
    }

    public void left() {
        System.out.println("PAC MAN LEFT");
    }

    public void right() {
        System.out.println("PAC MAN RIGHT");
    }
}
