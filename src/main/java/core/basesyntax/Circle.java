package core.basesyntax;

public class Circle implements Figure {

    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + this.getArea()
                + " sq. units, radius: " + radius
                + "units, color: " + color);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
