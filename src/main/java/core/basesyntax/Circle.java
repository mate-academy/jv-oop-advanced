package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.color = ColorSupplier.colorGen();
    }

    public Circle() {
        this.radius = FigureSupplier.lengthGen();
        this.color = ColorSupplier.colorGen();
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle,"
                + " area : " + calcArea() + " sq. units,"
                + " radius : " + radius
                + " color: " + color);
    }
}
