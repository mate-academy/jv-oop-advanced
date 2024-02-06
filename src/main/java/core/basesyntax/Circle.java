package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String name() {
        return (Figures.CIRCLE).name();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void buildFigure() {
        System.out.println("Figure: " + name() + ", area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());

    }
}
