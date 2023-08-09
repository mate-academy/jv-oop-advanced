package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", radius: " + radius + " units");
    }
}
