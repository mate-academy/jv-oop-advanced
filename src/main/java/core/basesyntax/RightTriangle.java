package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Name: right triangle" + ", color:" + getColor()
                + ", fist leg: " + firstLeg + " units, "
                + "second leg " + secondLeg + " units" + ", area:" + getArea() + " square units");
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }
}
