package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Circle \n" + "Area - " + getArea() + "\n"
                + "Color - " + color + "\n" + "Radius - " + radius);
    }
}
