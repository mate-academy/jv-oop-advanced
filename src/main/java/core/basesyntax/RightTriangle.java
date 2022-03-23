package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;

    }

    @Override
    public int getArea() {
        return (int) (0.5 * (firstLeg * secondLeg));
    }

    @Override
    public void getDetails() {
        System.out.println(getColor() + " " + " right triangle with height " + firstLeg
                + ", foundation " + secondLeg + " and area of " + getArea());
    }
}
