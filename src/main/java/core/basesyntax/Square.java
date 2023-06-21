package core.basesyntax;

public class Square extends Figure {
    protected double sideA;

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    public Square(double sideA, String color) {
        this.sideA = sideA;
        this.color = color;
        this.area = getArea();
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
