package core.basesyntax.figure;

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
    public double calculateArea() {
        return Math.round(Math.PI * getRadius() * getRadius());
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", radius: " + radius + " units");
    }
}
