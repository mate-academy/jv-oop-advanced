package core.basesyntax;

import java.util.Random;

public class Square extends Figure implements Drawing{
    private String color;
    private double side;

    public Square(double side) {
        this.side = side;
    }

    //getter for name
    public String getName () {
        return "Square";
    }

    //getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //getter and setter for side
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //method for area
    @Override
    double area() {
        return this.side * this.side;
    }

    // returning general info via String for our object
    @Override
    public String toDrawInfo() {
        return ("Figure: " + getName() + ", " + "area: " + area() + " sq.units, " + "side: " + getSide() + " units, " +
                "color: " + getColor());
    }
}
