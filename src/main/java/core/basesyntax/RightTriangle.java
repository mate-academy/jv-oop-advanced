package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg, secondLeg, thirdLeg;
    private String color;

    public RightTriangle(double firstLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = firstLeg;
        this.thirdLeg = firstLeg;
        this.color = color;
    }

    public RightTriangle() {
    }

    @Override
    public double findArea() {
        return (firstLeg * firstLeg * Math.pow(3, 2)) / 4;
    }

    @Override
    public String printAllInformation() {
        return null;
    }
}
