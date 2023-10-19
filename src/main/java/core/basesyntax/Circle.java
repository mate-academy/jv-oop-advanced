package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        this.setColor(color);
        this.radius = radius;
    }

    @Override
    public void obtainTheArea() {
        setArea(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + String.format("%.2f", getArea())
                + " sq. units, radius: " + radius + " units, color: " + getColor().toLowerCase());
    }
}
