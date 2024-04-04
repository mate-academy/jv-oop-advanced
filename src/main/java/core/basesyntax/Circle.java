package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    private String color;

    public Circle(String color, double radius) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureName.Circle.name() + ", area: " + Math.round(getArea()
                * 10.0) / 10.0 + " sq. units, radius: " + Math.round(getRadius() * 10.0)
                / 10.0 + " units, color: " + getColor() + ".");
    }
}
