package core.basesyntax;

public class Circle extends AbstractFigure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawAFigure() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius + " units, color: "
                + getColor().name().toLowerCase());
    }
}
