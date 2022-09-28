package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        if (!FigureDimensionsValidator.isValidDimensions(radius)) {
            throw new FigureDimensionError(this.getClass().getSimpleName());
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return super.draw() + " { radius: " + radius + " units, area: "
                + getArea() + " square units, color: " + getColor() + " }";
    }
}
