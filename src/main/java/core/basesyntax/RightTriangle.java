package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    @Override
    public int GetArea() {
        return (firstLeg / 2) * secondLeg;
    }
}
