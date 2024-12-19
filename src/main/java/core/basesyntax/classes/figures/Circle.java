package core.basesyntax.classes.figures;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void drawData() {
        System.out.printf("Figure: circle, area: %.1f sq. units, radius: %d units, "
                + "color: %s%n", this.calculateArea(), this.radius, super.getColor());
    }
}
