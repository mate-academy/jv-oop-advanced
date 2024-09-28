package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        setColor(Color.WHITE.name());
        this.radius = radius;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: circle, area: " + obtainTheArea() + " sq. units, radius: "
                + radius + " units, color: " + getColor());
    }

    @Override
    public double obtainTheArea() {
        return Math.PI * radius * radius;
    }
}
