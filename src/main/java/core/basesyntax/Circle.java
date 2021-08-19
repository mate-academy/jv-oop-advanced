package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        String information = String.format("Figure: circle, area: %,.2f sq.units,"
                        + " %d units, color: %s",
                        getArea(), radius, getColor());
        System.out.println(information);
    }
}
