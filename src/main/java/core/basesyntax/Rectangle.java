package core.basesyntax;

public class Rectangle implements Figures {
    private double first;
    private double second;
    private Colors color;

    public Rectangle(Colors color, double first, double second) {
        this.color = color;
        this.first = first;
        this.second = second;
    }

    @Override
    public Colors getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return first * second;
    }

    public double getA() {
        return first;
    }

    public double getB() {
        return second;
    }
}
