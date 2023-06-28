package core.basesyntax.figures;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle\nColor : " + getColor()
                + "\nArea: " + getArea() + "\nRadius: " + radius);
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * radius;
    }
}
