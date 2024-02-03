package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + this.getArea()
                + " sq. units, radius: " + radius
                + "units, color: " + this.getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
