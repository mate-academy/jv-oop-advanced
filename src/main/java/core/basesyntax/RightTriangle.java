package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
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
        System.out.println(" Figure: right triangle, area: " + firstLeg * secondLeg / 2
                + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units,"
                + " color: " + this.getColor());
    }
}
