package com.dy;

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

    public void setUpTeam(String team){
        System.out.println("Set up team=" + team);
    }
    public static void main(String avg[]){
        Football football = new Football();
        football.setHomeTeam("East team");
        football.setVisitingTeam("West team");
        football.setUpTeam("Middle team");
        football.gameStart();
        football.gameEnd();
    }
}
