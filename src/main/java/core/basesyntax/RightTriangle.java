package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, Drawable {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String getColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        color = colorSupplier.getRandomColor();
        return color;
    }

    @Override
    public String draw() {
        return "Figure: right triangle. FirstLeg: " + firstLeg + " mm." + " SecondLeg: "
                + secondLeg + "mm. Area: " + getArea() + " sq.mm. Color: " + color;
    }
}
