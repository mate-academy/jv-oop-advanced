package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int a, int b, String str) {
        this.firstLeg = a;
        this.secondLeg = b;
        setColor(str);
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
    }

    @Override
    public Double calculateArea() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq. units, first leg: "
                + firstLeg + ", second leg: " + secondLeg
                + " units, color: " + getColor());
    }
}
