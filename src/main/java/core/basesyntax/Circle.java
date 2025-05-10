package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, side radius: "
                + radius + " units, color: " + getColor());
    }
}
