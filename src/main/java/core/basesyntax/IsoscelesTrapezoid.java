package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sizeOfSide;
    private double sizeOfTop;
    private double sizeOfBottom;

    public IsoscelesTrapezoid(double sizeOfSide, double sizeOfBottom, String color) {
        super("Isosceles trapezoid", color);
        this.sizeOfSide = sizeOfSide;
        this.sizeOfBottom = sizeOfBottom;
        this.sizeOfTop = FigureSupplier.lengthGen(sizeOfBottom, sizeOfSide);
    }

    @Override
    public double calculateArea() {
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
        System.out.println("Figure:" + getName()
                + " area : " + this.calculateArea() + " sq. units,"
                + " top length : " + this.sizeOfTop
                + " bot length : " + this.sizeOfBottom
                + " side length : " + this.sizeOfSide
                + " color: " + getColor());
    }
}
