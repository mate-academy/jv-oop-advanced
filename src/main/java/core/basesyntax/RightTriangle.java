package core.basesyntax;

public class RightTriangle extends Figure {
    private float firstLeg;
    private float secondLeg;

    public RightTriangle(String color) {
        super(color);
    }

    public RightTriangle(String color, float firstLeg, float secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public float getFirstLeg() {
        return firstLeg;
    }

    public float getSecondLeg() {
        return secondLeg;
    }

    @Override
    public float getArea() {
        return getFirstLeg() * getSecondLeg() / 2;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing "
                + getColor()
                + " right triangle with first leg equals to "
                + getFirstLeg()
                + "and second leg equals to "
                + getSecondLeg()
                + " area equals "
                + getArea());
    }
}
