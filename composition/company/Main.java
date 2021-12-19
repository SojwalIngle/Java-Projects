package com.company;

//public class Car {
//    private int doors ;
//    private int gears;
//    private String ModelName ;
//    private String color;
//
//    public void setModelName(String modelName){
//        this.ModelName = modelName;
//    }
//
//    public String getModelName(){
//        return  this.ModelName;
//    }
//
//    public void setColor(String color){
//        this.color = color;
//    }
//
//    public String getColor(){
//        return this.color;
//    }
//
//    public void setDoors(int doors){
//        this.doors = doors;
//    }
//
//    public int getDoors(){
//        return this.doors;
//    }
//
//    public void setGears(int gears){
//        this.gears = gears;
//    }
//
//    public int getGears(){
//        return this.gears;
//    }
//
//}


public class Main {

    public static void main(String[] args) {
      Car audi = new Car(4,6,"MG HECTOR","Black");
//      audi.setModelName("TATA NAXON");
//      audi.setColor("Blue");
//      audi.setDoors(4);
//      audi.setGears(6);

        System.out.println("Car name: "  + audi.getModelName());
        System.out.println("Car colour: " + audi.getColor());
        System.out.println("Doors are : "+ audi.getDoors());
        System.out.println("Gears are: " + audi.getGears());


    }
}
