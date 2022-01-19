package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String print() {
        return "Figure: circle, area:"
                + " sq.units radius: "
                + this.radius
                + " units, color: "
                + this.getColor();
    }
}
