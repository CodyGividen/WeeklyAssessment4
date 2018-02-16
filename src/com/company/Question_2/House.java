package com.company.Question_2;

public class House {
    private int bedRooms;
    private int bathRooms;
    private int floors;
    private boolean basement;


    public House(int bedRooms, int bathRooms, int floors, boolean basement) {
        this.bedRooms = bedRooms;
        this.bathRooms = bathRooms;
        this.floors = floors;
        this.basement = basement;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(int bedRooms) {
        this.bedRooms = bedRooms;
    }

    public int getBathRooms() {
        return bathRooms;
    }

    public void setBathRooms(int bathRooms) {
        this.bathRooms = bathRooms;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public boolean isBasement() {
        return basement;
    }

    public void setBasement(boolean basement) {
        this.basement = basement;
    }
}
