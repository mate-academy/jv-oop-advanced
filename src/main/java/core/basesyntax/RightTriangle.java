package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int legOne, int legTwo, Colors color) {
        this.firstLeg = legOne;
        this.secondLeg = legTwo;
        this.setColor(color);
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle, area: " + calculateArea() + " sq. units, first leg: "
                + getFirstLeg() + " units, second leg: " + getSecondLeg()
                + " units, color: " + getColor());
    }
}
