package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle() {
        this.radius = random.nextInt(VALUE_LIMIT);
        this.color = colorSupplier.getRandomColor();
        area();
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
        area();
    }

    @Override
    public void area() {
        this.area = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.1f sq.units, radius: %d units, color: %s%n",
                area, radius, color);
    }
}
