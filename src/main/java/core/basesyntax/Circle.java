package core.basesyntax;

public class Circle extends Figure {
    private static final double DEFAULT_DECIMAL_RANK = 10.0;
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius * DEFAULT_DECIMAL_RANK) / DEFAULT_DECIMAL_RANK;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq. units,"
                + " radius: " + radius + " units,"
                + " color: " + getColor()
        );
    }
}
