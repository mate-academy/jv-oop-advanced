package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side;
    private double firstBase;
    private double secondBase;

    public IsoscelesTrapezoid(String color, double side, double fistBase, double secondBase) {
        super(color);
        this.side = side;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    public double getSide() {
        return side;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2 * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, firstBase: " + firstBase + " units, secondBase: "
                + secondBase + " units, height: " + side + " units, color: " + getColor());
    }
}
