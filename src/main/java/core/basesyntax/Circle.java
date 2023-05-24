package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double obtainArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", radius: " + this.getRadius() + " units, color: " + this.getColor());
    }
}
