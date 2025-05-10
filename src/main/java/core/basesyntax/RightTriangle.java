package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg > 0 ? firstLeg : 0;
        this.secondLeg = secondLeg > 0 ? secondLeg : 0;
    }

    @Override
    public double getArea() {
        return this.firstLeg * this.secondLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: right triangle, area: "
                + this.getArea() + " sq.units, firstLeg: "
                + this.getFirstLeg() + " units, "
                + "secondLeg: " + this.getSecondLeg() + " units, color: "
                + this.getColor());
    }

    public int getFirstLeg() {
        return this.firstLeg;
    }

    public int getSecondLeg() {
        return this.secondLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }
}
