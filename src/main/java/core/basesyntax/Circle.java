package core.basesyntax;

public class Circle extends Figure implements Drawing {
    private String color;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //getter for name
    public String getName() {
        return "Circle";
    }

    //getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //method for area
    @Override
    double area() {
        return Math.PI * (this.radius * this.radius);
    }

    // returning general info via String for our object
    @Override
    public String toDrawInfo() {
        return ("Figure: " + getName() + ", " + "area: " + area() + " sq.units, "
                + "radius: " + getRadius() + " units, " + "color: " + getColor());
    }
}
