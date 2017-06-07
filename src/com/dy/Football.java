package com.dy;

import javafx.scene.effect.Light;
import javafx.scene.shape.StrokeLineCap;

/**
 * Created by dongyan on 07/06/17.
 */
public class Football implements Sports, Event {
    @Override
    public void setHomeTeam(String name) {
        System.out.println("I am home team!");
    }

    @Override
    public void setVisitingTeam(String name) {
        System.out.println("I am visting team!");
    }

    @Override
    public void gameStart() {
        System.out.println("Game starts!");
    }

    @Override
    public void gameEnd() {
        System.out.println("Game ends!");
    }

    public static void main(String avg[]){
        Football football = new Football();
        football.setHomeTeam("East team");
        football.setVisitingTeam("West team");
        football.gameStart();
        football.gameEnd();
    }
}
