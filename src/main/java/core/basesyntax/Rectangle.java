package core.basesyntax;

public class Rectangle extends ColorFigure implements Figure {//s =a*b;
    private double firstLeg;
    private double secondLeg;

    public Rectangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea() + " sq.units, "
                + " firstLeg: " + firstLeg + " units "
                + " secondLeg: " + secondLeg + " units ," + " color: " + color);
    }
}
//Figure: square, area: 25.0 sq.units, side: 5 units, color: blue