package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double shortLeg;
    private double longLeg;
    private double height;

    public IsoscelesTrapezoid(String color, double shorterLeg, double longerLeg, double height) {
        super(color);
        this.shortLeg = shorterLeg;
        this.longLeg = longerLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (shortLeg + longLeg) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq. units, shortLeg: "
                + shortLeg
                + " units, longLeg: "
                + longLeg
                + " units, height: "
                + height
                + " units, color: "
                + getColor());
    }
}
