package core.basesyntax;

public class RightTriangle extends Figure implements Drawable {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }


    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5f;
    }
}
