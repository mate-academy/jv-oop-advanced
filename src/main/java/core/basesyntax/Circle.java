package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void drawFigure() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + new ColorSupplier().getRandomColor().toLowerCase());
    }
}
