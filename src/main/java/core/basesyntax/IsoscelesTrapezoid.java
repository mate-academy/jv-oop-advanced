package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq.units, firstBase: " + firstSide + " units, secondBase: "
                + secondSide + " units, high: " + height + " units, color: " + getColor());

    }
}
