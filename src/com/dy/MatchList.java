package com.dy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Percy on 19/06/17.
 */
public class MatchList {
    private ArrayList<Match> matchList;

    public MatchList(){
        this.matchList = new ArrayList<Match>();
    }

    public ArrayList<Match> getMatchList(){
        return this.matchList;
    }

    public static Date parseDate(String date){
        try {
            return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(date);
        }catch (ParseException e){
            return null;
        }
    }

    public static void main(String args[])
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Match match1 = new Match(3, "home1", "away1", parseDate("2013/11/25 18:45:00"));
        Match match2 = new Match(2, "home2", "away2", parseDate("2013/08/25 17:45:00"));
        Match match3 = new Match(1, "home3", "away3", parseDate("2013/11/25 18:45:00"));
        Match match4 = new Match(4, "home4", "away4", parseDate("2014/09/23 17:45:00"));
        Match match5 = new Match(5, "home5", "away5", parseDate("2012/10/25 20:45:00"));

        MatchList matchList = new MatchList();
        matchList.getMatchList().add(match1);
        matchList.getMatchList().add(match2);
        matchList.getMatchList().add(match3);
        matchList.getMatchList().add(match4);
        matchList.getMatchList().add(match5);

        System.out.println("Originally.");
        for(Match match : matchList.getMatchList()){
            System.out.println(match.getMatchId() + " " +
                    match.getHomeTeam() + " vs " +
                    match.getAwayTeam() + " " + dateFormat.format(match.getMatchDate()));
        }

//        Collections.sort(matchList.getMatchList(), new Comparator<Match>() {
//            @Override
//            public int compare(Match o1, Match o2) {
//                int value = -1;
//                if(o1.getMatchDate().compareTo(o2.getMatchDate()) > 0){
//                    value = 1;
//                    return value;
//                }else if(o1.getMatchDate().compareTo(o2.getMatchDate()) == 0){
//                    if(o1.getMatchId() > o2.getMatchId()){
//                        value = 1;
//                        return value;
//                    }
//                }
//                return value;
//            }
//        });

        // Bulb sort
        for(int i = 0; i < matchList.getMatchList().size() - 1; i++){
            for(int j = 1; j < matchList.getMatchList().size() - i; j++){
                Match firstMatch = matchList.getMatchList().get(j - 1);
                Match nextMatch = matchList.getMatchList().get(j);
                if(firstMatch.getMatchDate().compareTo(nextMatch.getMatchDate()) > 0){
                    matchList.getMatchList().set(j - 1, nextMatch);
                    matchList.getMatchList().set(j, firstMatch);
                }else if(firstMatch.getMatchDate().compareTo(nextMatch.getMatchDate()) == 0){
                    // if date is the same, compare the match id
                    if(firstMatch.getMatchId() > nextMatch.getMatchId()){
                        matchList.getMatchList().set(j - 1, nextMatch);
                        matchList.getMatchList().set(j, firstMatch);
                    }
                }
            }
        }

        System.out.println("After sort. List from earliest to latest by time and match ID.");
        for(Match match : matchList.getMatchList()){
            System.out.println(match.getMatchId() + " " +
                    match.getHomeTeam() + " vs " +
                    match.getAwayTeam() + " " + dateFormat.format(match.getMatchDate()));
        }
        System.out.println("List by Match ID from biggest to smallest.");
        Collections.sort(matchList.getMatchList());
        for(Match match : matchList.getMatchList()){
            System.out.println(match.getMatchId() + " " +
                    match.getHomeTeam() + " vs " +
                    match.getAwayTeam() + " " + dateFormat.format(match.getMatchDate()));
        }
    }
}
