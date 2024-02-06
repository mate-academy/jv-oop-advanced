package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void figureInfo() {
        System.out.println(String.format("Figure: circle, area: %f sq.units, radius:%f units,"
                + " color: %s",getArea(),radius,super.getColor()));

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
