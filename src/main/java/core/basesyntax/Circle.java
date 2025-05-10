package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, String figuresName, double radius) {
        super(color, figuresName);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, radius length: " + radius
                + " units, color: " + getColor());
    }
}
