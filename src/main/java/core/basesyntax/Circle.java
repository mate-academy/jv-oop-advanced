package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void draw() {
        String out = String.format("Figure: circle, area: %,.2f sq.units,"
                        + " %d units, color: %s",
                        getArea(), this.radius, getColor());
        System.out.println(out);
    }
}
