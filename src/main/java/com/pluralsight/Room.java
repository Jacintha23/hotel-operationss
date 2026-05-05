package com.pluralsight;

    public class Room
{
        private String roomType;
        private int numberOfBeds;
        private double price;
        private boolean isOccupied;
        private boolean isDirty;
        // may not be necessary to add checkOut here.
    public Room(String roomType, int numberOfBeds, double price, boolean isOccupied, boolean isDirty)
    {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {return !isOccupied && !isDirty;}

    public void checkIn()
    {
        isDirty = true;
        isOccupied = true;
    } // multiple lines should be separate!

    public void checkOut()
    {
        isOccupied = false;
        isDirty = true;
    }

    // When a guest checks out of a room it must first be cleaned by a housekeeper, before
    //another guest can check into the room.
    public void cleanRoom()
    {
        isDirty = false;
    }


}
