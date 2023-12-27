package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double high;

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + this.getRadiusArea() + " firstSide " + getFirstSide()
                + " secondSide " + getSecondSide() + " hight " + getHigh()
                + ", color: " + getColor());
    }

    @Override
    public double getRadiusArea() {
        return (firstSide + secondSide) * high;
    }
}
