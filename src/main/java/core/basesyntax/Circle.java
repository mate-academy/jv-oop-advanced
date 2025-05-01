package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double obtainArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: circle, area:" + " " + obtainArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
