package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    Circle() {
        radius = random.nextInt(NUMBER);
        setArea(getArea());
        setColor(colorSupplier.getRandomColor());
    }

    Circle(String color, int radius) {
        this.radius = radius;
        setColor(color);
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, radius: %d units, color: %s%n",
                getClass().getSimpleName().toLowerCase(), getArea(), radius, getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
