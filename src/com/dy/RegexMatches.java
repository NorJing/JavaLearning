package com.dy;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// need to add external lib courserajava and ojdbc6

public class RegexMatches {
    private static final String REGEX = "dog";
    private static String INPUT = "a dog and two dogs";
//    private static Pattern pattern;
//    private static Matcher matcher;
    private static final String REPLACE = "cat";

    public void regexMatch1(){
        // String to be scanned to find the pattern.
        String test = "Today it is 40 degree!";
        String patten = "(.*)\\b(\\d+)\\b(.*)";
        patten = "(.*)(\\d+)(.*)";
        Pattern r = Pattern.compile(patten);
        Matcher m = r.matcher(test);

//        if (m.find()){
//            System.out.println("match is=" + m.group(0));
//            System.out.println("match is=" + m.group(1));
//            System.out.println("match is=" + m.group(2));
//            System.out.println("match is=" + m.group(3));
//        }else {
//            System.out.println("no match!");
//        }
        while (m.find()){
            System.out.println("match is=" + m.group(2));
        }
    }

    public void replaceByRegex(){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }

    public static void main( String args[] ) {
//        RegexMatches run = new RegexMatches();
//        // run.replaceByRegex();
//        run.regexMatch1();

        // int 0
        // float 0.44444445
        // double 0.4444444444444444
//        int b = 4;
//        float a = (float) 4 /9;
//        double c = (double) 4 /9;
//        int d = 4/9;
//        System.out.println(d);

        String url = "http://www.betsystem.com/index.php?id=5&lang=no";
        String url2 = "http://www.betsystem.com/index.php?lang=no&id=15";
        String pattern = "(.*)index\\.php\\?(id=|lang=)(.*)&(lang=|id=)(.*)";
        Pattern p = Pattern.compile(pattern);
        ArrayList<String> list = new ArrayList<String>();
        list.add(url);
        list.add(url2);

        for(String s : list){
            Matcher m = p.matcher(s);
            if(m.find()){
                System.out.println("match is=" + m.group(0));
                System.out.println("match is=" + m.group(1));
                System.out.println("match is=" + m.group(2));
                System.out.println("match is=" + m.group(3));
                System.out.println("match is=" + m.group(4));
                System.out.println("match is=" + m.group(5));
                System.out.println("#######");
            }else{
                System.out.println("No match!");
            }
        }
    }
}
