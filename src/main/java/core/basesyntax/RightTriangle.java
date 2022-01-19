package core.basesyntax;

public class RightTriangle extends Figure implements FigureProperties {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure: right triangle. FirstLeg: " + firstLeg + " mm." + " SecondLeg: " + secondLeg +
                "mm. Area: " + getArea() + " sq.mm. Color: " + color;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

}
