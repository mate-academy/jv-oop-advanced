package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Colors color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
