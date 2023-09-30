package core.basesyntax;

public class Circle extends Figure implements Area {
    private int radius;

    public Circle(String color, int radius) {
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
        System.out.println("Figure: circle, " + "area: " + getArea() + ","
                + " radius: " + radius + "," + " color: " + super.getColor());
    }
}
