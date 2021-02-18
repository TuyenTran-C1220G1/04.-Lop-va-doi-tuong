package com.company.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean fanOn = true;
    private boolean fanOff = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
        this.speed = SLOW;
        this.fanOn = true;
        this.radius = 5;
        this.color = "blue";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTurn(boolean fanOn) {
        this.fanOn = fanOn;
    }

    public void display() {
        if (this.fanOn == true) {
            System.out.println("fan is on, " + "the speed is = " + this.speed + ", the color is = " + this.color + ", the radius is = " + this.radius);
        } else {
            System.out.println("fan is off, " + "the color is = " + this.color + ", the radius is = " + this.radius);
        }

    }

}
