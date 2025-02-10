package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
