package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int thirdLeg;

    public IsoscelesTrapezoid (String color, int firstLeg, int secondLeg, int thirdLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.thirdLeg = thirdLeg;
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

    public int getThirdLeg() {
        return thirdLeg;
    }

    public void setThirdLeg(int thirdLeg) {
        this.thirdLeg = thirdLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg + secondLeg) * thirdLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "isoscelesTrapezoid, "
                + "area: " + calculateArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, "
                + "thirdLeg: " + thirdLeg + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
