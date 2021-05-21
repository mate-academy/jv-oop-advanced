package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color) {
        super(color);

    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("circle, area: "
                + getArea() + " , radius: "
                + getRadius() + " , color: " + getColor());

    }
}

