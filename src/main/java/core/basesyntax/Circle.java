package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = Math.PI;
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, Figure radius: "
                    + radius
                    + ", Area: "
                    + getArea()
                    + " Color: "
                    + getColor());
    }
}
