package com.pluralsight;

public class Hotel {
    private String name;
    private int suites;
    private int numberOFRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int suites, int numberOFRooms) {
        this.name = name;
        this.suites = suites;
        this.numberOFRooms = numberOFRooms;
    }

    public Hotel(String name, int suites, int numberOFRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.suites = suites;
        this.numberOFRooms = numberOFRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getSuites() {
        return suites;
    }

    public int getNumberOFRooms() {
        return numberOFRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
}
