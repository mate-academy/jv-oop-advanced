package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
            + calculateArea() + " sq. units, radius: "
            + this.radius + " units, color: "
            + this.getColor());
    }
}
