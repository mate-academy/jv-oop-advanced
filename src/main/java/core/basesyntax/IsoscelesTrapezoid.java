package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstLeg = firstSide;
        this.secondLeg = secondSide;
        this.height = height;
    }

    public int getFirstSide() {
        return firstLeg;
    }

    public void setFirstSide(int firstSide) {
        this.firstLeg = firstSide;
    }

    public int getSecondSide() {
        return secondLeg;
    }

    public void setSecondSide(int secondSide) {
        this.secondLeg = secondSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) * height / 2;
    }

    @Override
    public void printInformation() {
        System.out.printf("Figure: rectangle, area: %s sq.units, "
                + "firstSide: %s units, secondSide: %s units, height: %s, color: "
                + "%s%n", getArea(), firstLeg, secondLeg, height, getColor());
    }
}
