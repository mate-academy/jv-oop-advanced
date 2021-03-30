package core.basesyntax;

public class Square extends Figure {
    private double sizeOfSide;

    public Square(int sizeOfSide) {
        this.sizeOfSide = sizeOfSide;
        this.color = ColorSupplier.colorGen();
    }

    public Square() {
        this.sizeOfSide = FigureSupplier.lengthGen();
        this.color = ColorSupplier.colorGen();
    }

    @Override
    public double calcArea() {
        return this.sizeOfSide * this.sizeOfSide;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square,"
                + " area : " + calcArea() + " sq. units,"
                + " side length : " + sizeOfSide
                + " color: " + color);
    }
}
