package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("circle, area: " + this.getArea() + " sq. units, radius: "
                + this.radius + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
