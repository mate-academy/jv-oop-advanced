package core.basesyntax.model;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        String name = getClass().getSimpleName();
        double area = getArea();
        String color = getColor();

        System.out.println("Figure: " + name + ", area: " + area + " eq. units, color: " + color);
    }
}
