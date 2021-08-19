package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("circle, area: " + this.getArea()
                + " sq.units, radius: " + this.radius + " units, color: "
                + super.getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
