package core.basesyntax;

public class Circle extends CommonValues {
    private double radius;

    public Circle(double radius, String color) {
        super();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + "sq. units, "
                + "radius: " + radius + " units, color: " + color);
    }
}
