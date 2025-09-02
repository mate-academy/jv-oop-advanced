package core.basesyntax.model;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: "
                + "color: " + getColor()
                + ", radius: " + getRadius() + " units"
                + ", area: " + getArea() + " square units");
    }
}
