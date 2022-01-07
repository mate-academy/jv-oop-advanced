import java.util.Random;

public class Circle extends Figure implements Draw {
    private Random random = new Random();
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, " + " radius " + getRadius()
                + " units, color " + getColor());
    }
}
