package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure implements Drawing{
    private String color;
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    //getter for name
    public String getName () {
        return "Rectangle";
    }
    //getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //getter and setter for sideA
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    //getter and setter for sideB
    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    //method for area
    @Override
    double area() {
        return this.sideA * this.sideB;
    }

    // returning general info via String for our object
    @Override
    public String toDrawInfo() {
        return ("Figure: " + getName() + ", " + "area: " + area() + " sq.units, " + "sideA: " + getSideA() + " units, " +
                "sideB: " + getSideB() + " units, " + "color: " + getColor());
    }
}
