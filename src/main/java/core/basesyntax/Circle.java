package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private static final String NAME = "circle";

    public Circle (String color, int radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String draw() {
        return "Figure: " + NAME + ", area: " + this.getArea() + " sq.units, radius: " + this.radius + " units, color: " + this.color;
    }
}
