package core.basesyntax;

public class Circle extends Figure {
    private static final int EXPONENT_NUM = 2;
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, EXPONENT_NUM);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %,.2f sq.units, radius: %d units, color: %s%n",
                calculateArea(), radius, color.name());
    }
}
