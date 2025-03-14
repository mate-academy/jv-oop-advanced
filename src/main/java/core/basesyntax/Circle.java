package core.basesyntax;

public class Circle extends Figure implements Area, Draw {
    private int radius;
    private final static String NAME = "Circle";

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double printArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + NAME + ", area: " + printArea() + " sq. units, radius: " + radius + " units, color: " + getColor());
    }
}
