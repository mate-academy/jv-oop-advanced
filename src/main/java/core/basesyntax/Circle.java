package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: "
                + "color: " + getColor()
                + ", radius: " + getRadius()
                + ", area: " + getArea());
    }

    @Override
    double getArea() {
        double area = Math.PI * radius * radius;
        return Math.round(area * NUMBER_FOR_ROUND) / NUMBER_FOR_ROUND;
    }
}
