package core.basesyntax;

public class IsoscelesTrapezoid extends ColorFigure implements Figure { //s = (a+b)/2 * h
    private double firstLeg;
    private double secondLeg;
    private double height;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double height, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area " + getArea() + " sq.units, "
                            + " firstLeg: " + firstLeg + " units "
                            + " secondLeg: " + secondLeg + " units ,"
                            + " height: " + height + " units ," + " color: " + color);
    }

}

