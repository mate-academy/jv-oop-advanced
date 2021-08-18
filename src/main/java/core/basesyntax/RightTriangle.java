package core.basesyntax;

public class RightTriangle extends Figure implements Behavior {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color, String name) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(color);
        super.setName(name);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
