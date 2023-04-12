package core.basesyntax;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double gerArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println(gerArea());
    }
}
