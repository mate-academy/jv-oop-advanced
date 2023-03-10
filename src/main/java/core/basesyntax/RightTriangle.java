package core.basesyntax;

public class RightTriangle implements Figure {
    private final FigureColor color;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(FigureColor color, double firstLeg, double secondLeg) {
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
        System.out.println("Right Triangle: color = "
                + color
                + ", first leg = "
                + firstLeg + ", second leg = "
                + secondLeg + ", area = "
                + getArea() + " sq.units.");
    }
}
