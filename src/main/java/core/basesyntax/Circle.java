package core.basesyntax;

public class Circle extends Figure implements Area, Draw {
    private String color;
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.rint((Math.PI * radius * radius));
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area()
                + " sq.units, radius: " + radius + " units, color "
                + color);
    }
}
