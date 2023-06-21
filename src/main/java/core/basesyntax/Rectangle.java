package core.basesyntax;

public class Rectangle extends Square {
    protected double sideB;

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    public Rectangle(double sideA, double sideB, String color) {
        super(sideA, color);
        this.sideB = sideB;
        this.area = getArea();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideB=" + sideB +
                ", sideA=" + sideA +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
