package com.dy;

/**
 * Created by dongyan on 07/06/17.
 */
import edu.duke.*;

public class FindURL {
    public void findURL(){
        URLResource urlResource = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for(String url : urlResource.lines()){
            if (url.contains("youtube")){
                System.out.println(url);
            }
        }
    }
    public String mystery(String dna) {
        int pos = dna.indexOf("T");
        int count = 0;
        int startPos = 0;
        String newDna = "";
        if (pos == -1) {
            return dna;
        }
        while (count < 3) {
            count += 1;
            newDna = newDna + dna.substring(startPos,pos);
            startPos = pos+1;
            pos = dna.indexOf("T", startPos);
            if (pos == -1) {
                break;
            }
        }
        newDna = newDna + dna.substring(startPos);
        return newDna;
    }

    public static void main(String arg[]){
        FindURL findURL = new FindURL();
//        findURL.findURL();
        String test = "AAATGGGTBBBTCCCTDDDT";
        System.out.println(findURL.mystery(test));
    }
}
