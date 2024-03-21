package core.basesyntax.figures;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
        this.area = (int) ((radius * radius) * Math.PI);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + area
                + " sq.units, radius: " + radius
                + " units, color: " + color);
    }
}
