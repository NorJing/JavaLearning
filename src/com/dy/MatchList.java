package com.dy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by dongyan on 19/06/17.
 */
public class MatchList extends ArrayList<Match>{
    private ArrayList<Match> matchList;

//    public MatchList(ArrayList<Match> matchList){
//        this.matchList = matchList;
//    }

    public MatchList(){

    }

    public void addMatch(Match match){
        matchList.add(match);
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

//        ArrayList<Match> matches = new ArrayList<Match>();
//        matches.add(match1);
//        matches.add(match2);
//        matches.add(match3);

        MatchList matchList = new MatchList();
        matchList.addMatch(match1);
        matchList.addMatch(match2);
        matchList.addMatch(match3);

//        for(Match match : matches){
//            System.out.println(match.getMatchDate());
//        }

        for(Match match : matchList){
            System.out.println(match.getMatchDate());
        }

//        for(int i = 0; i < matchList.size(); i++){
//            System.out.println(i);
//            System.out.println(matchList.get(i).getMatchDate());
//        }
    }
}
