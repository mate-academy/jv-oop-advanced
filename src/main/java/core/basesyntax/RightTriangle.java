package core.basesyntax;

public class RightTriangle implements Figure {
    private String color;
    private double side;

    public RightTriangle(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure : RightTriangle " + "color: " + getColor()
                + " side " + String.format("%.2f", side)
                + " area: " + String.format("%.2f", getArea()) + '}';
    }
}

