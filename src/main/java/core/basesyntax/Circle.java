package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + calculateArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }

    public void drawDefaultCircle() {
        System.out.println("Figure: circle, area: " + calculateArea() + " sq.units, radius: "
                + radius + " units, color: " + getDefaultColor());
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
