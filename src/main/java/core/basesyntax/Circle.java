package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateFigureArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + String.format("%.2f", calculateFigureArea())
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
