package core.basesyntax;

public class RightTriangle extends ColorFigure implements Figure { //s = (a*b)/2
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, "
                + " firstLeg: " + firstLeg + " units "
                + " secondLeg: " + secondLeg + " units , " + "color: " + color);
    }
}
//Figure: triangle, area: 12.5 sq.units, firstLeg: 7 units, secondLeg: 5 units, color: yellow