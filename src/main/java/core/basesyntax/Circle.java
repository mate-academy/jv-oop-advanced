package core.basesyntax;

public class Circle extends Figure {

    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %1$s, area: %2$.1f %3$s, radius: %4$.1f %5$s, color: %6$s%n",
                this.getClass().getSimpleName().toLowerCase(),
                getArea(),
                "sq." + super.getMeasureUnit(getArea()),
                radius,
                super.getMeasureUnit(radius),
                super.getColor());
    }
}
