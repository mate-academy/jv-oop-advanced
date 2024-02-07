package core.basesyntax.figures;

public class Circle extends GeometricFigure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("GeometricFigure: circle, area: " + getArea() + " sq.units,"
                + " radius: " + this.radius + " units, color: " + getColor());
    }
}
