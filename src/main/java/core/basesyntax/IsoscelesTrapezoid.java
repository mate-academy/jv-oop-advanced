package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid() {
        super(ColorSupplier.getRandomColor());
        sideA = FigureSupplier.getRandomLength();
        sideB = FigureSupplier.getRandomLength();
        height = FigureSupplier.getRandomLength();
    }

    @Override
    public String toString() {
        return "Figure: isoscelesTrapezoid; " +
                this.drawArea() +
                "; sideA: " + sideA +
                "; sideB: " + sideB +
                "; height: " + height +
                "; colour: " + this.getColor() +
                ';';
    }

    @Override
    public String drawArea() {
        return "area: " + (((sideA + sideB) / 2) * height) + " sq.units";
    }
}
