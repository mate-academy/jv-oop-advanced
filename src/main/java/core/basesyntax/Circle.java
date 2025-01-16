package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + roundToTwoDecimals(getArea())
                + " sq. units, radius: " + roundToTwoDecimals(radius) + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
