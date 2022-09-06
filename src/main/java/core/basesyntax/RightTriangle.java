package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    @Override
    public double calculateArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String draw() {
        return "RightTriangle{"
                + "firstLeg=" + firstLeg
                + ", secondLeg=" + secondLeg
                + ", color='" + color + '\''
                + '}';
    }
}
