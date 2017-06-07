package com.dy;

import java.util.regex.*;

/**
 * Created by dongyan on 06/06/17.
 */
public class RegexMatches {
    private static String REGEX = "a*b";
    // aab foo aab foo ab foo b
    private static String INPUT = "aabfooaabfooabfoob";
    private static String REPLACE = "-";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while(m.find()) {
            m.appendReplacement(sb, REPLACE);
            System.out.println("sb=" + sb);
        }
        System.out.println("sb.tostring=" + sb.toString());
        m.appendTail(sb);

        System.out.println("sb2=" + sb);
        System.out.println("sb.tostring=" + sb.toString());
    }
}
