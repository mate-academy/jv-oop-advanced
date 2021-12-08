package core.basesyntax;

public class Square implements Figure {
    private String color;
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure : Square" + "color: " + getColor()
                + " side " + String.format("%.2f", side)
                + " area: " + String.format("%.2f", getArea()) + '}';
    }
}
