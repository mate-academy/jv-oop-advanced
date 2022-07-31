package core.basesyntax.figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String figureType, String color, double firstLeg, double secondLeg) {
        super(figureType, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: " + getFigureType()
                + ", area: " + getArea() + " sq.units,"
                + " firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

}
