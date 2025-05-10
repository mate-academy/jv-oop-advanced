package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double leg;
    private final double largerBase;
    private final double smallerBase;
    private final double height;

    public IsoscelesTrapezoid(double leg, double largerBase, double smallerBase, String color) {
        super(color);
        this.leg = leg;
        this.largerBase = largerBase;
        this.smallerBase = smallerBase;
        this.height = Math.sqrt(leg * leg - ((getLargerBase() - getSmallerBase())
            * (getLargerBase() - getSmallerBase())) / 4);

    }

    public double getLeg() {
        return leg;
    }

    public double getLargerBase() {
        return largerBase;
    }

    public double getSmallerBase() {
        return smallerBase;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {

        double area = ((getSmallerBase() + getSmallerBase()) * getHeight()) / 2;
        return Math.floor(area * Math.PI * 100) / 100.0;
    }

    public void display() {
        System.out.println("Figure: isosceles trapezoid," + " area: "
                + calculateArea() + " sq.units," + " height: "
                + getHeight() + " units," + " leg: "
                + getLeg() + " units," + " largerBase: "
                + getLargerBase() + " units," + " smallerBase: "
                + getSmallerBase() + " units," + " color: " + getColor());
    }
}
