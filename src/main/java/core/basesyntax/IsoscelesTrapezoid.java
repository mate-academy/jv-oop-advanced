package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double bottomSide;
    private double upperSide;
    private double height;

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(double bottomSide) {
        this.bottomSide = bottomSide;
    }

    public double getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(double upperSide) {
        this.upperSide = upperSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, bottomSide: " + getBottomSide()
                + " units, upperSide: " + getUpperSide()
                + " units, height: " + getHeight()
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return height * (bottomSide + upperSide) / 2;
    }

    @Override
    public void draw() {

    }
}
