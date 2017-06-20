package com.dy;

import java.text.DateFormat;
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

    public static void main(String args[])
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        Match match1 = new Match(1, "home1", "away1", dateFormat.format(date));

        Date date2 = new Date(System.currentTimeMillis() - (4 * 60 * 60 * 1000));
        Match match2 = new Match(2, "home2", "away2", dateFormat.format(date2));

        Date date3 = new Date(System.currentTimeMillis() - (3 * 60 * 60 * 1000));
        Match match3 = new Match(3, "home3", "away3", dateFormat.format(date3));

        MatchList matchList = new MatchList();
        matchList.getMatchList().add(match1);
        matchList.getMatchList().add(match2);
        matchList.getMatchList().add(match3);

        for(int i = 0; i < matchList.getMatchList().size(); i++){
            System.out.println(matchList.getMatchList().get(i).getMatchDate());
        }

        for(Match match : matchList.getMatchList()){
            System.out.println(match.getMatchDate());
        }
    }
}
