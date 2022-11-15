package core.basesyntax;

public class Rectangle extends ColorFigure implements Figure {//s =a*b;
    private double firstLeg;
    private double secondLeg;

    public Rectangle(String color) {
        super(color);
    }

   public Rectangle(String color, double firstLeg, double secondLeg ) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea() + " sq.units, "
                + " firstLeg: " + firstLeg + " units "
                + " secondLeg: " + secondLeg + " units ," + " color: " + getColor());
    }
}
//Figure: square, area: 25.0 sq.units, side: 5 units, color: blue