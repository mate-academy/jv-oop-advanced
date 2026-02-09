package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        if (firstLeg <= 0 || secondLeg <= 0) {
            return;
        }
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
    public double area() {
        return this.getFirstLeg() * this.getSecondLeg() / 2;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: right triangle, area: "
                + this.area() + "sq. units, first leg: "
                + this.getFirstLeg() + ", second leg: "
                + this.getSecondLeg() + " ,color: " + getColor());
    }
}
