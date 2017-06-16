package com.dy;

/**
 * Created by dongyan on 07/06/17.
 */
import edu.duke.*;
import org.apache.commons.csv.*;

import java.util.ArrayList;


public class WhichCountriesExport {
    public void listExporters(CSVParser parser, String exportOfInterest) {
        int count = 0;
        //for each row in the CSV File
        for (CSVRecord record : parser) {
            //Look at the "Exports" column
            String export = record.get("Exports");
            //Check if it contains exportOfInterest
            if (export.contains(exportOfInterest)) {
                //If so, write down the "Country" from that row
                String country = record.get("Country");
                String exports = record.get("Exports");
                String value = record.get("Value (dollars)");
                String amount = "$999,999,999";
                System.out.println(country + ":" + export + " " + value);
                count++;
//                if(value.length() > amount.length()){
//                    System.out.println(country + ":" + export + " " + value);
//                }
            }
        }
        System.out.println("count=" + count);
    }

    public void findCountry(CSVParser csvParser, String country){
        for(CSVRecord csvRecord : csvParser){
            String countryFromRecord = csvRecord.get("Country");
            if(countryFromRecord.contains(country)){
                String exports = csvRecord.get("Exports");
                System.out.println("exports=" + exports);
            }
        }
    }
    public void exporterFishAndNuts(CSVParser parser) {
        //for each row in the CSV File
        for (CSVRecord record : parser) {
            //Look at the "Exports" column
            String export = record.get("Exports");
            //Check if it contains exportOfInterest
            if (export.contains("fish") && export.contains("nuts")) {
                //If so, write down the "Country" from that row
                String country = record.get("Country");
                String value = record.get("Value (dollars)");
                String amount = "$999,999,999";
                System.out.println(country + ":" + export + " " + value);
            }
        }
    }
    public void bigValueCountry(CSVParser parser) {
//        ArrayList<String> countries = new ArrayList<String>();
//        ArrayList<Integer> values = new ArrayList<Integer>();
        //for each row in the CSV File
        for (CSVRecord record : parser) {
            String value = record.get("Value (dollars)");
            String amount = "$999,999,999,999";
            if (value.length() > amount.length()) {
                String country = record.get("Country");
//                countries.add(country);
//                values.add(value.length());
                System.out.println("country=" + country);
            }
        }
    }
    public void whoExportsCoffee() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        listExporters(parser, "coffee");
    }

    public void whoExportsCocoa() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        listExporters(parser, "cocoa");
    }

    public void exporterCottonAndFlowers(CSVParser parser) {
        for (CSVRecord record : parser) {
            String export = record.get("Exports");
            //Check if it contains exportOfInterest
            if (export.contains("cotton") && export.contains("flower")) {
                String country = record.get("Country");
                String value = record.get("Value (dollars)");
                String amount = "$999,999,999";
                System.out.println(country + ":" + export + " " + value);
            }
        }
    }
    public static void main(String arg[]){
        FileResource fileResource = new FileResource();
        CSVParser parser = fileResource.getCSVParser();
        WhichCountriesExport whichCountriesExport = new WhichCountriesExport();

//        whichCountriesExport.listExporters(parser, "gold");
//        // whichCountriesExport.exporterFishAndNuts(parser);
//        whichCountriesExport.findCountry(parser, "Nauru");
        whichCountriesExport.bigValueCountry(parser);

        // whichCountriesExport.exporterCottonAndFlowers(parser);
        // whichCountriesExport.whoExportsCocoa();
    }
}
