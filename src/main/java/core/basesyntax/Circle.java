package core.basesyntax;

public class Circle extends Figure {
    private static final String FIGURE = "circle";
    private int radius;

    protected Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toDraw() {
        return "Figure: " + FIGURE + ", area: " + findArea() + ", radius: " + this.radius
                + ", color: "
                + this.color;
    }
}
