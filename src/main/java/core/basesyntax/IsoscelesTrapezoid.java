package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomSide;
    private int topSide;
    private int lateralSide;

    public IsoscelesTrapezoid(String color, int bottomSide, int topSide, int lateralSide) {
        super(color);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.lateralSide = lateralSide;
    }

    public int getFirstLeg() {
        return bottomSide;
    }

    public void setFirstLeg(int firstLeg) {
        this.bottomSide = bottomSide;
    }

    public int getSecondLeg() {
        return topSide;
    }

    public void setSecondLeg(int secondLeg) {
        this.topSide = topSide;
    }

    public int getThirdLeg() {
        return lateralSide;
    }

    public void setThirdLeg(int thirdLeg) {
        this.lateralSide = lateralSide;
    }

    @Override
    public double calculateArea() {
        return (bottomSide + topSide) * lateralSide / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "isoscelesTrapezoid, "
                + "area: " + calculateArea() + " sq.units, "
                + "bottomSide: " + bottomSide + " units, "
                + "secondLeg: " + topSide + " units, "
                + "lateralSide: " + lateralSide + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
