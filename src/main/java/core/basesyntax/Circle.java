package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + name() + ", Color is " + getColor() + " Area = "
                + getArea() + " radius = " + radius);
    }

    @Override
    public String name() {
        return String.valueOf(Figures.CIRCLE);
    }
}
