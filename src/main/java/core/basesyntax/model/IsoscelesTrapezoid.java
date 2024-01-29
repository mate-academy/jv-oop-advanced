package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private double baseUpper;
    private double baseLover;
    private double side;

    public IsoscelesTrapezoid(String color, double baseUpper, double baseLover, double side) {
        super(color);
        this.baseUpper = baseUpper;
        this.baseLover = baseLover;
        this.side = side;
    }

    public double getBaseUpper() {
        return baseUpper;
    }

    public void setBaseUpper(double baseUpper) {
        this.baseUpper = baseUpper;
    }

    public double getBaseLover() {
        return baseLover;
    }

    public void setBaseLover(double baseLover) {
        this.baseLover = baseLover;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double obtainArea() {
        return (baseUpper + baseLover) / 4.0 * Math.sqrt(4.0 * side * side
                - ((baseLover - baseUpper) * (baseLover - baseUpper)));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + obtainArea()
                + " sq.units, baseUpper: " + baseUpper
                + " units, baseLover: " + baseLover
                + " units, side: " + side
                + " units, color: " + getColor());
    }
}
