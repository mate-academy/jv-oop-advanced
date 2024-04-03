package core.basesyntax;

public class Circle extends Figure {

    private final String nameFigure = "Circle";
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public String getNameFigure() {
        return nameFigure;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getNameFigure() + ", area: " + Math.round(area()
                * 10.0) / 10.0 + " sq. units, radius: " + Math.round(getRadius() * 10.0)
                / 10.0 + " units, color: " + getColor() + ".");
    }
}
