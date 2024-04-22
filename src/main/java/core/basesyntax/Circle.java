package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: circle, area "
                + calculateArea()
                + ", radius: "
                + radius
                + ", color: "
                + getColor()
        );
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
