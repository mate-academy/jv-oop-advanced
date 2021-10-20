package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle() {
        this.radius = random.nextInt(MAX_NUMBER);
        area = getArea();
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: "
                + String.format("%.2f", area) + " sq.units, radius: "
                + radius + " units, color: "
                + color;
    }
}
