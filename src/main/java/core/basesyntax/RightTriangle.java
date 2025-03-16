package core.basesyntax;

public class RightTriangle extends Figure {
    public int firstLeg;
    public int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(color);
    }

    @Override
    public void drawArea() {
        System.out.println(firstLeg * secondLeg / 2);
    }
}
