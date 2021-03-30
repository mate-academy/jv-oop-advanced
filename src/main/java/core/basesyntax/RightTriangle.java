package core.basesyntax;

public class RightTriangle extends Figure {
    private double sizeOfFirstLeg;
    private double sizeofSecondLeg;
    private double sizeOfHypotenuse;

    public RightTriangle(double sizeOfFirstLeg, double sizeofSecondLeg, String color) {
        super("Right triangle",color);
        this.sizeOfFirstLeg = sizeOfFirstLeg;
        this.sizeofSecondLeg = sizeofSecondLeg;
        this.sizeOfHypotenuse = Math.sqrt(sizeOfFirstLeg * sizeOfFirstLeg
                + sizeofSecondLeg * sizeofSecondLeg);
    }

    @Override
    public double calculateArea() {
        return sizeofSecondLeg * sizeOfFirstLeg / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure:" + getName()
                + " area : " + this.calculateArea() + " sq. units,"
                + " first leg length : " + this.sizeOfFirstLeg
                + " second leg length : " + this.sizeofSecondLeg
                + " hypotenuse length : " + this.sizeOfHypotenuse
                + " color: " + getColor());
    }
}
