package core.basesyntax;

public class Circle extends Figure implements Area {
    private double radius;

    public Circle (double radius) {
        super(new ColorSupplier().getRandomColor());
        if (radius > 0) {
            this.radius = radius;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area " + getArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
