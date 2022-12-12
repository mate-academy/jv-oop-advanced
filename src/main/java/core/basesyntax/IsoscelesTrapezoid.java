package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upLeg;
    private int rightLeg;
    private int downLeg;
    private int high;

    public IsoscelesTrapezoid(String color, int upLeg, int rightLeg, int downLeg, int high) {
        super(color);
        this.upLeg = upLeg;
        this.rightLeg = rightLeg;
        this.downLeg = downLeg;
        this.high = high;
    }

    public int getUpLeg() {
        return upLeg;
    }

    public void setUpLeg(int upLeg) {
        this.upLeg = upLeg;
    }

    public int getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(int rightLeg) {
        this.rightLeg = rightLeg;
    }

    public int getDownLeg() {
        return downLeg;
    }

    public void setDownLeg(int downLeg) {
        this.downLeg = downLeg;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    public double calculateArea() {
        return ((upLeg + downLeg) / 2) * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, upLeg: " + upLeg
                + " units, rightLeg: " + rightLeg
                + " units, downLeg: " + downLeg
                + " units, high: " + high
                + " unit, color: " + getColor());
    }
}
