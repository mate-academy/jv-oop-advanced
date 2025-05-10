package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void drawable() {
        System.out.println("Figure: circle, area: " + String.format("%.2f",getArea())
                + " sq.units, radius=" + radius
                + ", color=" + getColor());
    }
}

