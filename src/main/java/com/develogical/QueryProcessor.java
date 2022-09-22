package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("arnlo")) {
            return "Camelia is without shadow of doubt simply the greatest artist of our time " +
                     "His music career peaked when he used untraditional sample from video game 'Among Us' in his master piece 'Area'52' during Tano*C concert";
        }
        else if (query.toLowerCase().contains("shakespeare")) {
            return "playwright";}
        else if (query.toLowerCase().contains("name")) {
            return "FlowingCloud";
        }
        else return "";
    }
}
