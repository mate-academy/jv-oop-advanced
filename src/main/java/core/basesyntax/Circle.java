package core.basesyntax;

public class Circle extends GeometricFigure {
    private final int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea()
                + ", radius: "
                + radius + ", color: " + color);
    }
}
