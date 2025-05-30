package core.basesyntax;

public class Circle extends AbstractFigure {

    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: circle, area: " + (Math.PI * radius * radius)
                + " sq.units, radius: " + radius + " units, color: " + color);
    }
}
