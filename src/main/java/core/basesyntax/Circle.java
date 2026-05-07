package core.basesyntax;

public class Circle extends Figure {
    private double radiusCircle;

    public Circle(double radius, Color color) {
        super(color);
        this.radiusCircle = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radiusCircle * radiusCircle;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radiusCircle + " units, color: " + color.name());
    }
}
