package core.basesyntax;

public class RightTriangle extends Figure {
    private int height;
    private int base;

    public RightTriangle() {
        super(ColorSupplier.getRandomColor());
        height = FigureSupplier.getRandomLength();
        base = FigureSupplier.getRandomLength();
    }

    @Override
    public String toString() {
        return "Figure: rightTriangle; " +
                this.drawArea() +
                "; height: " + height +
                "; base: " + base +
                "; colour: " + this.getColor() +
                ';';
    }

    @Override
    public String drawArea() {
        return "area: " + ((height * base) / 2) + " sq.units";
    }
}
