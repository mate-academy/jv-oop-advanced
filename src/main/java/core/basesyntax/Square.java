package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square() {
        super(ColorSupplier.getRandomColor());
        side = FigureSupplier.getRandomLength();
    }

    @Override
    public String toString() {
        return "Figure: square; " +
                this.drawArea() +
                "; side: " + side +
                "; colour: " + this.getColor() +
                ';';
    }

    @Override
    public String drawArea() {
        return "Figure's area is " + (side * side) + " sq.units";
    }
}
