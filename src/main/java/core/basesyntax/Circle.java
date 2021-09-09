package core.basesyntax;

public class Circle extends ColorSupplier implements Figure {
    private int radius;

    public void setParameters(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public String behaviour() {
        return "Figure: circle, area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + getRandomColor();
    }
}
