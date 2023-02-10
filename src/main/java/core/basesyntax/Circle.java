package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = 3.14159;
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.println("Figure: ");
    }

    @Override
    public double getArea() {
        return 0;
    }
}
