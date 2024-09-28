package core.basesyntax;

public class RightTriangle implements Figure {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: right triangle, area %.2f, "
                + "first leg: %.2f, second leg: %.2f, triangle color: %s",
                getArea(), firstLeg, secondLeg, color));
    }
}
