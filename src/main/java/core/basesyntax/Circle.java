package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Drawable {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getName() {
        return "circle";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + " area: " + area() + " sq.units, side: "
                + getRadius() + " units, color: " + color());
    }
}
