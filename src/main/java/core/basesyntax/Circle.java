package core.basesyntax;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double countArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Circle, area: " + countArea() + " sq.units, radius: "
                           + radius + " units, color: " + getColor());
    }
}
