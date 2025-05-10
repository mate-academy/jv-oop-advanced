package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double countArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, radius = " + radius + " units, area = "
                + countArea() + " sq.units, color = " + getColor().name());
    }
}
