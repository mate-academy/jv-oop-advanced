package core.basesyntax;

public class Circle extends Figure {
    protected double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getFigureArea() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: circle, area: " + this.getFigureArea()
                + " sq.units, radius: " + radius + " units, color: " + color);
    }
}
