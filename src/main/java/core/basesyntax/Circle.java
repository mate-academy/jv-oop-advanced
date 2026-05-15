package core.basesyntax;

public class Circle extends Figure {

    private static final double PI = Math.PI;
    private double radius;

    public Circle(double radius, Colors color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, " + "Radius " + radius
                + LENGTH_UNITS + ", " + "Color: " + color.name() + ", "
                + "Area: " + getArea() + AREA_UNITS);

    }

    @Override
    public double getArea() {

        double area = PI * Math.pow(radius, 2);
        return area;
    }

}
