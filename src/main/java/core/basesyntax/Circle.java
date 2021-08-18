package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double countArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: circle, area: " + countArea() + " sq.units, radius: "
                + radius + " units, color: " + color);
    }
}
