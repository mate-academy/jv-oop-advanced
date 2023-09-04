package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstSide;
    private double secondSide;

    public RightTriangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return Math.sqrt((firstSide * firstSide) + (secondSide * secondSide));
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("" + getColor() + " right triangle with area of "
                + getArea() + " sq. units and sides of " + firstSide + ", "
                + secondSide + ", and " + getThirdSide() + " units");
    }

    @Override
    public double getArea() {
        return firstSide * secondSide / 2;
    }
}
