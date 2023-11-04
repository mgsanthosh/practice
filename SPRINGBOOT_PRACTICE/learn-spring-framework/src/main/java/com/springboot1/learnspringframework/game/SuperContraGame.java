package com.springboot1.learnspringframework.game;

public class SuperContraGame implements GamingConsole{
    public void up() {
        System.out.println("SUPER CONTRA JUMP");
    }

    public void down() {
        System.out.println("SUPER CONTRA HOLE");
    }

    public void left() {
        System.out.println("SUPER CONTRA LEFT");
    }

    public void right() {
        System.out.println("SUPER CONTRA RIGHT");
    }
}
