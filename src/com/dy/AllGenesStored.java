package com.dy;

/**
 * Created by dongyan on 07/06/17.
 */
import edu.duke.*;

import java.util.*;

public class AllGenesStored {
    public int findStopCodon(String dnaStr, int startIndex, String stopCodon){
        int currIndex = dnaStr.indexOf(stopCodon, startIndex+3);
        while (currIndex != -1 ) {
            int diff = currIndex - startIndex;
            if (diff % 3  == 0) {
                return currIndex;
            }
            else {
                currIndex = dnaStr.indexOf(stopCodon, currIndex + 1);
            }
        }
        return -1;
    }
    public String findGene(String dna, int where) {
        int startIndex = dna.indexOf("ATG", where);
        if (startIndex == -1) {
            return "";
        }
        int taaIndex = findStopCodon(dna,startIndex,"TAA");
        int tagIndex = findStopCodon(dna,startIndex,"TAG");
        int tgaIndex = findStopCodon(dna,startIndex,"TGA");
        int minIndex = 0;
        if (taaIndex == -1 ||
                (tgaIndex != -1 && tgaIndex < taaIndex)) {
            minIndex = tgaIndex;
        }
        else {
            minIndex = taaIndex;
        }
        if (minIndex == -1 ||
                (tagIndex != -1 && tagIndex < minIndex)) {
            minIndex = tagIndex;
        }
        if (minIndex == -1){
            return "";
        }
        return dna.substring(startIndex,minIndex + 3);
    }
    public StorageResource getAllGenes(String dna) {
        //create an empty StorageResource, call it geneList
        StorageResource geneList = new StorageResource();
        //Set startIndex to 0
        int startIndex = 0;
        System.out.println("startIndex_before=" + startIndex);
        //Repeat the following steps
        while ( true ) {
            //Find the next gene after startIndex
            String currentGene = findGene(dna, startIndex);
            //If no gene was found, leave this loop
            if (currentGene.isEmpty()) {
                break;
            }
            //Add that gene to geneList
            geneList.add(currentGene);
            //Set startIndex to just past the end of the gene
            startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
            System.out.println("startIndex_after=" + startIndex);
        }
        //Your answer is geneList
        return geneList;
    }
    public void testOn(String dna) {
        System.out.println("Testing getAllGenes on " + dna);
        StorageResource genes = getAllGenes(dna);
        for (String g: genes.data()) {
            System.out.println(g);
        }
    }

    public int findCTG(String dna){
        // ATGCTGCCATAG
        int start = dna.indexOf("CTG");
        int temp = 0;
        int count = 0;
        // System.out.println("start_before=" + start);
        while (start != -1){
            if (start == -1){
                break;
            }
            temp = dna.indexOf("CTG", start+3);
            // System.out.println("temp=" + temp);
            start = temp;
            count++;
            // System.out.println("start_after=" + start);
        }
        return count;
    }

    public int findLetter(String dna, char letter){
        // ATGCCATAG
        int start = dna.indexOf(letter);
        int temp = 0;
        int count = 0;
        // System.out.println("start_before=" + start);
        while (start != -1){
            if (start == -1){
                break;
            }
            temp = dna.indexOf(letter, start+1);
            // System.out.println("temp=" + temp);
            start = temp;
            count++;
            // System.out.println("start_after=" + start);
        }
        return count;
    }
    public float cgRatio(String dna){
        int cNUmber = findLetter(dna, 'C');
        int gNumber = findLetter(dna, 'G');
        return (float) (cNUmber + gNumber)/dna.length();
    }

    public int findMax(StorageResource storageResource){
        int i = 0;
        int temp = 0;
        int max = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(String s : storageResource.data()){
            arrayList.add(s.length());
        }
        System.out.println("arraylist is done! array size=" + arrayList.size());
        for(;i<arrayList.size()-1;i++){
            if(arrayList.get(i) > max){
                max = arrayList.get(i);
                System.out.println(max);
            }
        }
        return max;
    }
    public static void main(String avg[]) {
        AllGenesStored allGenesStored = new AllGenesStored();
        //      ATGv  TAAv  ATG   v  v  TGA
        // allGenesStored.testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
//        allGenesStored.testOn("");
//        //      ATGv  v  v  v  TAAv  v  v  ATGTAA
//        allGenesStored.testOn("ATGATCATAAGAAGATAATAGAGGGCCATGTAA");

        // System.out.println("###########################");
//        String test = "ATGCCATAG";
//        float result = allGenesStored.cgRatio(test);
//        System.out.println(result);

        FileResource fileResource = new FileResource("data/data");
        String dna = fileResource.asString();
        dna = dna.toUpperCase();
        // dna = "ATGATCTAATTTATGCTGCAACGGTGAAGA";
//        System.out.println("dna_whole_string=" + dna);
//        allGenesStored.testOn(dna);
        int count = 0;
        StorageResource genes = allGenesStored.getAllGenes(dna);

        for (String g: genes.data()) {
            System.out.println(g);
//            if(allGenesStored.cgRatio(g) >= 0.35){
//                count++;
//            }
//            if(g.length() > 60){
//                System.out.println("gene length=" + g.length());
//                count++;
//            }
//            System.out.println(g + "\n");
//            float result = allGenesStored.cgRatio(g);
//            System.out.println(result);

        }
        // System.out.println("count=" + count);
//        System.out.println("max=" + allGenesStored.findMax(genes));

//        System.out.println("################");
//        System.out.println(allGenesStored.findCTG(dna));
    }
}
