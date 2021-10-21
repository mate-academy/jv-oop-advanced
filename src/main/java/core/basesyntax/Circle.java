package core.basesyntax;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float countArea() {
        return (float) (Math.PI * radius * radius);
    }

    public void draw() {
        System.out.printf("Circle, area: %.2f sq.units,"
                + " radius: %d units, color: "
                + getColor() + "\n", countArea(), radius);
    }
}
