package core.basesyntax;

public class RightTriangle extends Figure {
    private double fitstLeg;
    private double secondLeg;

    public RightTriangle(String color, double fitstLeg, double secondLeg) {
        super(color);
        this.fitstLeg = fitstLeg;
        this.secondLeg = secondLeg;
    }

    public void setFitstLeg(double fitstLeg) {
        this.fitstLeg = fitstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getFitstLeg() {
        return fitstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return (fitstLeg * secondLeg) * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + this.getClass().getName()
                + ", area: "
                + getArea()
                + " sq.units, firstLeg: "
                + getFitstLeg()
                + " units, secondLeg: "
                + getSecondLeg()
                + " units, color: "
                + getColor()
        );
    }
}
