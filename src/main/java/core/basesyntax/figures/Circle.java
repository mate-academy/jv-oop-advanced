package core.basesyntax.figures;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s\nArea: %.2f\nRadius: %d\nColor: %s\n\n",
                getClass().getSimpleName(), getArea(), radius, getColor());
    }
}
