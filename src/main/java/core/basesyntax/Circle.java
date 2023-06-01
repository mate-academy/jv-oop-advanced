package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: circle, area: "
                + this.findArea() + " sq.units, radius: "
                + this.radius + " units, color: " + this.getColor());
    }
}
