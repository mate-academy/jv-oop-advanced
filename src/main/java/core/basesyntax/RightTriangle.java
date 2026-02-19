package core.basesyntax;
public class RightTriangle extends AbstractFigure implements Figure, Drawable {
    private double firstLeg;
    private double secondLeg;
    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
    @Override
    public double area() {
        return (firstLeg * secondLeg) / 2;
    }
    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, area: " + area() +
                        " sq. units, firstLeg: " + firstLeg +
                        " units, secondLeg: " + secondLeg +
                        " units, color: " + getColor()
        );
    }
}
