package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private String color;
    private int radius;

    protected Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void printFigure() {
        System.out.printf("Figure: circle, area: %.1f, radius: %d, color: %s.%n", this.getArea(),
                this.radius, this.color);
    }
}
