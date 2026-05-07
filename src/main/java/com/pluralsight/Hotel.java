package com.pluralsight;

public class Hotel
{
    /*
        * class will allow you to create a simple hotel object and check if there are rooms
            available for the current day only.
        * has 2 types of rooms
             * a King Suite and
             * a Basic Double room. (cannot combine)

        * should track:
             * the name,
             * numberOfSuites,
             * numberOfRooms,
             * bookedSuites and
             * bookedBasicRooms
       * no public setters for these variables
    */
    // Backing Variables
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // Constructors

    public Hotel(String name, int numberOfSuites, int numberOfRooms)
    {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms)
    {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }























}
