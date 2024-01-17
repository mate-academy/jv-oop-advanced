package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getStringFormat(calculateArea())
                + " sq. units, radius: " + getStringFormat(radius) + " units, "
                + "color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
}
