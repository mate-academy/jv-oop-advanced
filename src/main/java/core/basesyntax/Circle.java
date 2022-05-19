package core.basesyntax;

public class Circle extends FigureClass {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
        this.setInfo("Figure: circle, area: " + this.getArea() + " sq. units, radius: "
                + (int) this.radius + " units, color: " + this.getColor().toString().toLowerCase());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
