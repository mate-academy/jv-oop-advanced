package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, Drawable {

    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        return "Figure: right triangle. FirstLeg: " + firstLeg + " mm." + " SecondLeg: "
                + secondLeg + "mm. Area: " + getArea() + " sq.mm. Color: " + getColor();
    }
}
