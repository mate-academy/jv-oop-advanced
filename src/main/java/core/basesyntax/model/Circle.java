package core.basesyntax.model;

public class Circle extends Figure implements FigureRealisation {
    private double radius;
    private ColorSupplier colorCircle = new ColorSupplier();

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public ColorSupplier getColorCircle() {
        return colorCircle;
    }

    @Override
    public double areaOfFigure() {

        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        new StringBuilder().append("Figure: Circle, area: ")
                .append(areaOfFigure())
                .append(" sq.units, radius: ")
                .append(getRadius())
                .append(" units, color: ")
                .append(getColorCircle().getRandomColor());
    }
}
