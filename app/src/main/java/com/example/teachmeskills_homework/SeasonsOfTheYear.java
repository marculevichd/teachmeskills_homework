package com.example.teachmeskills_homework;

public class SeasonsOfTheYear {
    public static void main(String[] args) {
        Seasons seasons = Seasons.WINTER;
        System.out.println(myfaveSeason);


        for (Seasons season : Seasons.values()) {
            changeSeasons(season);
            System.out.println("average temperature " + season.degree);
            System.out.println(season.getDescription());

        }

    }

    public enum Seasons {
        SUMMER(25) {
            @Override
            public String getDescription() {
                return "warm season";
            }
        },
        WINTER(-10),
        AUTUMN(10),
        SPRING(15);

        private final int degree;

        Seasons(int degree) {
            this.degree = degree;
        }

        public String getDescription() {
            return "cold season";
        }
    }

    static String myfaveSeason = "Summer... Summer is the hottest of the four temperate seasons, occurring after spring and before autumn. At or centred on the summer solstice, the earliest sunrise and latest sunset occurs, daylight hours are longest and dark hours are shortest, with day length decreasing as the season progresses after the solstice. The date of the beginning of summer varies according to climate, tradition, and culture. When it is summer in the Northern Hemisphere, it is winter in the Southern Hemisphere, and vice versa.";

    static void changeSeasons(Seasons seasons) {
        switch (seasons) {
            case SUMMER:
                System.out.println("i love summer");
                break;
            case WINTER:
                System.out.println("i love winter");
                break;
            case AUTUMN:
                System.out.println("i love autumn");
                break;
            case SPRING:
                System.out.println("i love spring");
                break;
        }
    }
}



