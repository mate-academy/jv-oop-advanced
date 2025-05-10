package core.basesyntax;

public class RightTriangle extends Rectangle {
    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color, firstLeg, secondLeg, "triangle");
    }

    @Override
    public double calculateArea() {
        return super.calculateArea() / 2;
    }

    @Override
    protected String getAdditionalInfo() {
        return "firstLeg: " + width + " units, secondLeg" + height + " units";
    }
}
