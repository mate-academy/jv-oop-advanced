package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private final Color circleColor;

    public Circle(Color randomColor, double radius) {
        super(Parameters.DEFAULT_COLOR);
        this.radius = radius;
        this.circleColor = randomColor;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea()
                + " sq.units, radius: "
                + radius
                + " units, color: "
                + circleColor);
    }
}
