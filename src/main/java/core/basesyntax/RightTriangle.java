package core.basesyntax;

public class RightTriangle extends Figure implements Drawing {
    private String color;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    //getter for name
    public String getName() {
        return "RightTriangle";
    }

    //getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //getter and setter for firstLeg
    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    //getter and setter for secondLeg
    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    //method for area
    @Override
    double area() {
        return (this.firstLeg * this.secondLeg) / 2.0;
    }

    // returning general info via String for our object
    @Override
    public String toDrawInfo() {
        return ("Figure: " + getName() + ", " + "area: " + area() + " sq.units, " + "firstLeg: "
                + getFirstLeg() + " units, " + "secondLeg: " + getSecondLeg() + " units, "
                + "color: " + getColor());
    }
}
