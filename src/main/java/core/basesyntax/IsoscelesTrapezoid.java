package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure implements Drawing {
    private String color;
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double height) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;

    }

    //getter for name
    public String getName () {
        return "IsoscelesTrapezoid";
    }

    //getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //getter and setter for upperBase
    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    //getter and setter for lowerBase
    public double getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(double lowerBase) {
        this.lowerBase = lowerBase;
    }

    //getter and setter for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //method for area
    @Override
    double area() {
        return (upperBase + lowerBase) / 2.0 * height;
    }

    // returning general info via String for our object
    @Override
    public String toDrawInfo() {
        return ("Figure: " + getName() + ", " + "area: " + area() + " sq.units, " + "lowerBase: " + getLowerBase() +
                " units, " + "upperBase: " + getUpperBase() + " units, " + "height: " + getHeight() + " units, " + "color: " + getColor());
    }
}
