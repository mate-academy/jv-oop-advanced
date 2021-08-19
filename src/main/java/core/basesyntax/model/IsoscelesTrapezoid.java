package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure implements FigureRealisation {
    private double firstLeg;
    private double secondLeg;
    private double height;
    private ColorSupplier colorIsoscelesTrapezoid = new ColorSupplier();

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg, double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public double getHeight() {
        return height;
    }

    public ColorSupplier getColorIsoscelesTrapezoid() {
        return colorIsoscelesTrapezoid;
    }

    @Override
    public double areaOfFigure() {
        return (firstLeg + secondLeg) / 2 * height;
    }

    @Override
    public void drawFigure() {
        new StringBuilder().append("Figure: Isosceles trapezoid, area: ")
                .append(areaOfFigure())
                .append(" sq.units, side: ")
                .append(getFirstLeg())
                .append(" units, other side: ")
                .append(getSecondLeg())
                .append(" units, height: ")
                .append(getHeight())
                .append(", color: ")
                .append(getColorIsoscelesTrapezoid().getRandomColor());
    }
}


