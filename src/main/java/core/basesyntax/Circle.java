package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void draw() {
        System.out.println("Shape: circle, area: " + String.format("%.2f", calculateArea())
                + "sq. units, radius: " + radius
                + " sq. units, color: " + getColor());
    }
}
