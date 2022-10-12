package core.basesyntax;

public class Circle extends FigureColor implements Figure, AreaCalculator {
    private int radius;

    public void setCircle(int radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + getArea()
                            + " sq.units, radius: " + radius
                            + " units, color: " + getColor());
    }
}
