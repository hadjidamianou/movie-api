package com.dhadji.moviesapi.model;

// Encapsulation
public class Movie {

    private String id;
    private String name;
    private double duration;
    private int year;

    // What is method signature?
    public Movie() {

    }
//
//    public Movie(String name, double duration1, int year) {
//        this.name = name;
//        this.duration = duration1;
//        this.year = year;
//    }

     // alt + insert
    // right click -> generate

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public double getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
