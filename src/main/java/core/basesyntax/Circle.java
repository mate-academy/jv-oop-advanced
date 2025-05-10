package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure : circle" + " Area : " + getArea()
                + " Radius : " + getRadius()
                + " Color : " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Figure : circle" + " Area : " + getArea()
                + " Radius : " + getRadius()
                + " Color : " + getColor();
    }
}
