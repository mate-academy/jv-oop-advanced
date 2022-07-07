package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public String toDraw() {
        return "Figure: circle, area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + colorSupplier.getRandomColor();
    }
}
