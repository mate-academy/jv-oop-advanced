package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private String color;

    public Circle(String color, double radius) {
        super(color);
        getRadius();
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + getRadius()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}

