package core.basesyntax.model;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Radius: " +  radius);
    }

    @Override
    public double area() {
        return Math.PI * (Math.pow(radius, 2));
    }
}
