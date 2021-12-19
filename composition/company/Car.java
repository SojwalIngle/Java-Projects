package com.company;

public class Car {
    private int doors ;
    private int gears;
    private String ModelName ;
    private String color;

    public Car(int doors, int gears ,String modelName , String color){
        this.doors = doors;
        this.gears = gears;
        this.ModelName = modelName;
        this.color = color;
    }

//    public void setModelName(String modelName){
//        this.ModelName = modelName;
//    }

    public String getModelName(){
        return  this.ModelName;
    }

//    public void setColor(String color){
//        this.color = color;
//    }

    public String getColor(){
        return this.color;
    }

//    public void setDoors(int doors){
//        this.doors = doors;
//    }

    public int getDoors(){
        return this.doors;
    }

//    public void setGears(int gears){
//        this.gears = gears;
//    }

    public int getGears(){
        return this.gears;
    }



}
