package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int weight;

    public Rectangle() {
        super(ColorSupplier.getRandomColor());
        height = FigureSupplier.getRandomLength();
        weight = FigureSupplier.getRandomLength();
    }

    @Override
    public String toString() {
        return "Figure: rectangle; " +
                this.drawArea() +
                "; height: " + height +
                "; weight: " + weight +
                "; colour: " + this.getColor() +
                ';';
    }

    @Override
    public String drawArea() {
        return "area: " + (height * weight) + " sq.units";
    }
}
