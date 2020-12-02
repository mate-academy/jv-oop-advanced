package core.basesyntax;

public class Circle implements Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String drawFigure() {
        return "Shape: circle, area: " + getSquare() + ", radius: "
                + radius + ", color: " + getColor();
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return "green";
    }
}
