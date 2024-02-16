package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area:" + area() + "sq. units, radius: "
                + radius + " units, color: " + color);
    }
}
