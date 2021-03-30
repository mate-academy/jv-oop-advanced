package core.basesyntax;

public class Rectangle extends Figure {
    private double sizeOfFirstSide;
    private double sizeOfSecondSide;

    public Rectangle(int sizeOfFirstSide, int sizeOfSecondSide) {
        this.sizeOfFirstSide = sizeOfFirstSide;
        this.sizeOfSecondSide = sizeOfSecondSide;
        this.color = ColorSupplier.colorGen();
    }

    public Rectangle() {
        this.sizeOfFirstSide = FigureSupplier.lengthGen();
        this.sizeOfSecondSide = FigureSupplier.lengthGen();
        this.color = ColorSupplier.colorGen();
    }

    @Override
    public double calcArea() {
        return this.sizeOfSecondSide * this.sizeOfFirstSide;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle,"
                + " area : " + this.calcArea() + " sq. units,"
                + " first side length : " + this.sizeOfFirstSide
                + " second side length : " + this.sizeOfSecondSide
                + " color: " + color);
    }
}
