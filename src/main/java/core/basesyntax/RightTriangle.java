package core.basesyntax;

public class RightTriangle extends Figure {
    private double sizeOfFirstLeg;
    private double sizeofSecondLeg;
    private double sizeOfHypotenuse;

    public RightTriangle(int sizeOfFirstLeg, int sizeofSecondLeg) {
        this.sizeOfFirstLeg = sizeOfFirstLeg;
        this.sizeofSecondLeg = sizeofSecondLeg;
        this.sizeOfHypotenuse = Math.sqrt(sizeOfFirstLeg * sizeOfFirstLeg
                + sizeofSecondLeg * sizeofSecondLeg);
        this.color = ColorSupplier.colorGen();
    }

    public RightTriangle() {
        this.sizeOfFirstLeg = FigureSupplier.lengthGen();
        this.sizeofSecondLeg = FigureSupplier.lengthGen();
        this.sizeOfHypotenuse = Math.sqrt(sizeOfFirstLeg * sizeOfFirstLeg
                + sizeofSecondLeg * sizeofSecondLeg);
        this.color = ColorSupplier.colorGen();
    }

    @Override
    public double calcArea() {
        return sizeofSecondLeg * sizeOfFirstLeg / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle,"
                + " area : " + this.calcArea() + " sq. units,"
                + " first leg length : " + this.sizeOfFirstLeg
                + " second leg length : " + this.sizeofSecondLeg
                + " hypotenuse length : " + this.sizeOfHypotenuse
                + " color: " + color);
    }
}
