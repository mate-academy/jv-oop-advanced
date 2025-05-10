package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String name() {
        return String.valueOf(Figures.CIRCLE);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name() + ", area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}
