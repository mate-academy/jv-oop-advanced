package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color randomColor, double radius) {
        super(DEFAULT_COLOR);
        this.radius = radius;
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
                + color);
    }
}
