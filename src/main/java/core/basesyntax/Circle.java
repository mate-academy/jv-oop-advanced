package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;

    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.CIRCLE + ", area: " + getArea() + " sq.units, "
                + "side: " + radius + " units, " + "color: " + color);
    }
}
