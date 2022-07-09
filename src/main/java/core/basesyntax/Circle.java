package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: circle; area: " + getArea() + " square units;"
                + " radius: " + radius + " units; "
                + getColor());
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }
}