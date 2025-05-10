package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + calculate()
                + " sq. units, radius: " + radius + " color: " + color.name().toLowerCase());
    }

    @Override
    public double calculate() {
        return Math.round(Math.PI * radius * radius);

    }
}
