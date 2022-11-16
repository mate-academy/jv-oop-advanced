package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: "
                + this.getArea() + " sq.units, first side: "
                + this.firstSide + " units, second side: "
                + this.secondSide + " units, color: "
                + this.getColor();
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
