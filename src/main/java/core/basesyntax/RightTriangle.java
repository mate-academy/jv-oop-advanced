package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        String baseInfo = super.draw();
        return baseInfo + ", first leg: " + firstLeg + " units "
                + ", second leg: " + secondLeg + " units ";
    }
}
