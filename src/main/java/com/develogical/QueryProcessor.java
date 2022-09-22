package com.develogical;

import java.util.List;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("arnlo")) {
            return "Camelia is without shadow of doubt simply the greatest artist of our time " +
                     "His music career peaked when he used untraditional sample from video game 'Among Us' in his master piece 'Area'52' during Tano*C concert";
        }
        else if (query.toLowerCase().contains("shakespeare")) {
            return "playwright";}
        else if (query.toLowerCase().contains("name")) {
            return "EVMO";
        } else if (query.toLowerCase().contains("largest")) {
            String[] parts = query.split(":");
            String[] numbers = parts[1].split(",");
            int[] num = new int[numbers.length];

            for(int i = 0;i < num.length;i++)
                {
                // Note that this is assuming valid input
                // If you want to check then add a try/catch 
                // and another index for the numbers if to continue adding the others (see below)
                num[i] = Integer.parseInt(numbers[i]);
                }
            
            int max = num[0];
            for (int i = 1; i <  num.length; i++) {
                if (num[i] > max)
                max = num[i];
            }
            return String.valueOf(max);   
        }
        else return "";
    }
}
