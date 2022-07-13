package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowerSide;
    private int upperSide;
    private int height;

    public IsoscelesTrapezoid() {

    }

    public void setLowerSide(int lowerSide) {
        this.lowerSide = lowerSide;
    }

    public void setUpperSide(int upperSide) {
        this.upperSide = upperSide;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getAreaFigure() {
        return (lowerSide + upperSide) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid, area: " + getAreaFigure()
                + " sq.units, lowerSide: " + lowerSide + " units, upperSide: "
                + upperSide + " sq.units, height: " + height + " units, color: " + getColor());
    }
}
