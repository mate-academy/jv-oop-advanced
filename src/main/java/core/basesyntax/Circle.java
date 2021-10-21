package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double areaInfo() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: circle, area: "
                + areaInfo() + " sq.units, radius: "
                + getRadius() + " units, color: "
                + getColor());
    }
}
