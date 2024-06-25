package core.basesyntax;

public class RightTriangle implements Figure {
    private String color;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle: color="
                + color
                + ", firstLeg="
                + firstLeg
                + ", secondLeg="
                + secondLeg
                + ", area="
                + getArea());
    }
}
