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

    public void printMatchList(MatchList matchList){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        for(Match match : matchList.getMatchList()){
            System.out.println(match.getMatchId() + " " +
                    match.getHomeTeam() + " vs " +
                    match.getAwayTeam() + " " + dateFormat.format(match.getMatchDate()));
        }
    }

    public int sortByMatchDateAndMatchIdDescending(MatchList matchList){
        Collections.sort(matchList.getMatchList(), new Comparator<Match>() {
            @Override
            public int compare(Match o1, Match o2) {
                int value = -1;
                if(o1.getMatchDate().compareTo(o2.getMatchDate()) > 0){
                    value = 1;
                    return value;
                }else if(o1.getMatchDate().compareTo(o2.getMatchDate()) == 0){
                    if(o1.getMatchId() > o2.getMatchId()){
                        value = 1;
                        return value;
                    }
                }
                return value;
            }
        });
        return -100;
    }

    public int sortByMatchIdDescending(MatchList matchList){
        Collections.sort(matchList.getMatchList(), new Comparator<Match>() {
            @Override
            public int compare(Match o1, Match o2) {
                return Integer.compare(o2.getMatchId(), o1.getMatchId());
            }
        });
        return -100;
    }
}
