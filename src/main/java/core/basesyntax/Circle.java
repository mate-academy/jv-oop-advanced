package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    @Override
    public void area() {
        area = Math.round(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" radius: " + radius + " color: " + color);
    }
}
