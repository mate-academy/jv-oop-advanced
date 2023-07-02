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
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public String draw() {
        return "Figure: rightTriangle" + ", " + "area: " + String.format("%.1f",getArea())
                + " sq.units" + ", " + "firstLeg: " + firstLeg + " units" + ", "
                + "secondLeg: " + secondLeg + " units" + ", " + "color: "
                + getColor().toLowerCase();
    }
}
