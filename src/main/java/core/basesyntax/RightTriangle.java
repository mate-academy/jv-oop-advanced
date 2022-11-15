package core.basesyntax;

public class RightTriangle extends ColorFigure implements Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color) {
        super(color);
    }

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, "
                + " firstLeg: " + firstLeg + " units "
                + " secondLeg: " + secondLeg + " units , " + "color: " + getColor());
    }
}
//Figure: triangle, area: 12.5 sq.units, firstLeg: 7 units, secondLeg: 5 units, color: yellow