package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstLeg;
    private int secondLeg;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int height) {
        super(color);
        this.height = height;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getHeight() {
        return height;
    }

    public void setheight(int height) {
        this.height = height;
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

    public double areaCalculator() {
        return ((firstLeg + secondLeg) / 2 * height);
    }

    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: "
                + this.areaCalculator()
                + " sq.units, firstLeg: "
                + this.getFirstLeg()
                + " units, secondLeg: "
                + this.getSecondLeg()
                + " units, side: "
                + this.getHeight()
                + " units, color: "
                + this.getColor());
    }
}
