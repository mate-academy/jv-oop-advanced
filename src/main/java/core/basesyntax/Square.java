package core.basesyntax;

public class Square extends Figure {
    protected double sideA;

    public Square(double sideA, String color) {
        this.sideA = sideA;
        this.color = color;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return sideA * sideA;
    }

    @Override
    public String toString() {
        return "Square sideA=" + sideA + ", color=" + color + ", area=" + area;
    }
}
