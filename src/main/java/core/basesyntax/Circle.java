package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Radius - " + radius
                            + "Color - " + color
                            + "Area - " + getArea()
        );
    }
}
