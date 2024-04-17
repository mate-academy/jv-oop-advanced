package core.basesyntax;

public class Circle implements Figure{
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getPrint() {
        return null;
    }
}
