package core.basesyntax;

public class Circle implements Figure {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double gerArea() {
        return Math.PI * radius * radius;
    }
}
