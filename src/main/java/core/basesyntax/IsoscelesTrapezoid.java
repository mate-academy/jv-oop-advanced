package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double height;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double height, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (height / 2) * (firstLeg + secondLeg);
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, side: A " + firstLeg + " units, "
                + "B " + secondLeg + " units, height "
                + height + " units, color: " + color);
    }

}
