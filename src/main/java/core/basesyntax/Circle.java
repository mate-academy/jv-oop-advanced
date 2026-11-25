package core.basesyntax;

public class Circle extends Figure implements Drawable, AreaCalculator {
    private double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void printColor() {
        super.printColor();
    }

    @Override
    public double getArea() {
        return 3.14 * (radius * radius);
    }

    @Override
    public void drawable() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius + " units, color: " + getColor());
    }
}
