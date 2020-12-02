package core.basesyntax;

public class Triangle extends Shape {
    private int side1;
    private int side2;

    public Triangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String drawFigure() {
        return "Shape: triangle, area: " + getSquare() + ", side one: "
                + side1 + ", side two: " + side2 + ", color: " + getColor();
    }

    @Override
    public double getSquare() {
        return side1 * side2 / 2.0;
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }
}
