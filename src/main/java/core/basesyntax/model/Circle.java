package core.basesyntax.model;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure Circle"
                + "\nRadius is: " + getRadius()
                + "\nmeasure: " + getArea()
                + "\nColor: " + getColor());
    }
}
