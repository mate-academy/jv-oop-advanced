package core.basesyntax;

public class Rectangle implements Figure {
    private final String color;
    private final double side1;
    private final double side2;

    public Rectangle(String color, double side1, double side2) {
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public void draw() { // Zmiana na VOID
        System.out.println("Figure: rectangle, area: " + String.format("%.2f", getArea()) + " sq. units, side1: "
                + String.format("%.2f", side1) + " units, side2: " + String.format("%.2f", side2) + " units, color: " + color); // Ujednolicone units
    }
}
