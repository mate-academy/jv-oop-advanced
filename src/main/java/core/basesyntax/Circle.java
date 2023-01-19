package core.basesyntax;

public class Circle extends Figure{
    int radius;
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
        System.out.println("Figure: " + getClass().getSimpleName() + ", "
                + "area: " + this.getArea() + " sq.units, "
                + "radius: " + this.radius + " units, "
                + "color: " + this.color);
    }
}
