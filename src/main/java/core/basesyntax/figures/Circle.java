package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super("circle", color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        super.draw();
        System.out.print("radius: " + radius + " units" + System.lineSeparator());
    }
}
