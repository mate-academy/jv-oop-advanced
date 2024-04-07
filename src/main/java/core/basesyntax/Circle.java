package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public double obtain() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + obtain()
                + " sq. units, radius: " + radius
                + " units, color: " + color);
    }
}
