package core.basesyntax;

public class Circle extends Shape {
    private ColorSupplier sc = new ColorSupplier();
    private double radius;

    public Circle(String color, double radius) {
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
    public void getInfoAboutFigure() {
        System.out.println("Figure: circle , area : " + (Math.PI * (radius * radius))
                + " radius : " + radius
                + ", color: " + getColor());
    }
}
