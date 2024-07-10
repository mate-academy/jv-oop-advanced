package core.basesyntax;

public class Circle implements Figure {
    private int radius;

    public Circle(String color, int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
