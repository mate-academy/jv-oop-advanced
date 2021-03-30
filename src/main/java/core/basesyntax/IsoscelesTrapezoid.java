package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sizeOfSide;
    private double sizeOfTop;
    private double sizeOfBottom;

    public IsoscelesTrapezoid(double sizeOfSide, double sizeOfTop, double sizeOfBottom) {
        this.sizeOfSide = sizeOfSide;
        this.sizeOfBottom = sizeOfBottom;
        this.sizeOfTop = sizeOfTop;
        this.color = ColorSupplier.colorGen();
    }

    public IsoscelesTrapezoid() {
        this.sizeOfTop = FigureSupplier.lengthGen();
        this.sizeOfSide = FigureSupplier.lengthGen();
        this.sizeOfBottom = FigureSupplier.lengthGen(sizeOfTop, sizeOfSide);
        this.color = ColorSupplier.colorGen();
    }

    @Override
    public double calcArea() {
        if (sizeOfBottom - sizeOfTop + 2 * sizeOfSide < 0
                || sizeOfTop - sizeOfBottom + 2 * sizeOfSide < 0) {
            System.out.println("there is no such isosceles trapezoid");
            return 0;
        }
        return Math.sqrt((sizeOfTop + sizeOfBottom)
                * (sizeOfTop + sizeOfBottom)
                * (sizeOfTop - sizeOfBottom + 2 * sizeOfSide)
                * (sizeOfBottom - sizeOfTop + 2 * sizeOfSide)) / 4;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid,"
                + " area : " + this.calcArea() + " sq. units,"
                + " top length : " + this.sizeOfTop
                + " bot length : " + this.sizeOfBottom
                + " side length : " + this.sizeOfSide
                + " color: " + color);
    }
}
