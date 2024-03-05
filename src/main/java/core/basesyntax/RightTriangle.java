package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String getArea() {
        return String.valueOf((firstLeg * secondLeg)/2);
    }
    @Override
    public String draw() {
        return "Figure: RightTriangle, area:" + getArea() + "sq. units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + "units, color:" + super.draw();
    }
}
