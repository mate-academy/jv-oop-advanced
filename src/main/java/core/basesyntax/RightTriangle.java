package core.basesyntax;

public class RightTriangle extends Figure implements Drawable {
    private double firstLeg;
    private double secondLeg;

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea() + " sq.units, firstLeg: "
                + getFirstLeg() + " units, secondLeg: "
                + getSecondLeg() + " units, color : "
                + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
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

    public RightTriangle(double firstLeg, double hypotenuse, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
}
