package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstCatet;
    private int secondCatet;

    public void setFirstCatet(int firstCatet) {
        this.firstCatet = firstCatet;
    }

    public void setSecondCatet(int secondCatet) {
        this.secondCatet = secondCatet;
    }

    @Override
    public double getArea() {
        return (firstCatet * secondCatet) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle "
                + ", area: "
                + getArea()
                + " sq.units"
                + ", firstCatet: "
                + firstCatet
                + " units"
                + ", secondCatet: "
                + secondCatet
                + ", color: "
                + getColor());
    }
}
