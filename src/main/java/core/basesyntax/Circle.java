package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private double area;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.area = Math.round(Math.PI * (radius * radius));
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle,"
                + " area: " + area
                + " sq. units, radius: " + radius
                + " units, color: " + super.getColor());
    }

}
