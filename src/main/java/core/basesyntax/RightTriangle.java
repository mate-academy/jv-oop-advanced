package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + this.type.name().toLowerCase()
                + ", area: "
                + ((firstLeg * secondLeg) / 2)
                + " units, first leg: "
                + firstLeg
                + " units, second leg: "
                + secondLeg
                + " units, color: "
                + this.color.name().toLowerCase());
    }
}
