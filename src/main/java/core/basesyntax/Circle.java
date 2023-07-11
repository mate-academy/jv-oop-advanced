package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "Circle, area: " + getArea()
               + " sq.units," + "radius: " + radius + " units, "
               + "color: " + color);
    }
}
