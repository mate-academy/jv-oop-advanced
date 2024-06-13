package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double lowerBase;
    private double upperBase;
    private double side;

    public IsoscelesTrapezoid(String color, double lowerBase, double upperBase, double side) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return ((lowerBase + upperBase) / 2) * (Math.sqrt(Math.pow(side, 2)
                - Math.pow((lowerBase - upperBase), 2) / 4));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq. units, lowerBase: " + getLowerBase() + " units, upperBase "
                + getUpperBase() + " units, " + "side " + getSide()
                + " units, color: " + getColor());
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public double getSide() {
        return side;
    }
}
