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
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: "
                + this.getArea() + " sq.units, first side: "
                + this.firstSide + " units, second side: "
                + this.secondSide + " units, height: "
                + this.height + " units, color: "
                + this.getColor();
    }
}
