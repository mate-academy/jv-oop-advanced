package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private double area;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.area = Math.PI * (radius * radius);
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void draw() {
        double roundedArea = Math.round(getArea());
        System.out.println("Figure: circle,"
                + " area: " + roundedArea
                + " sq. units, radius: " + radius
                + " units, color: " + super.getColor());
    }

}
