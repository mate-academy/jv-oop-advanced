package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side;
    private double firstBases;
    private double secondBases;

    public IsoscelesTrapezoid(Color color, double side, double fistBases, double secondBases) {
        super(color);
        this.side = side;
        this.firstBases = firstBases;
        this.secondBases = secondBases;
    }

    public double getSide() {
        return side;
    }

    public double getFirstBases() {
        return firstBases;
    }

    public double getSecondBases() {
        return secondBases;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setFirstBases(double firstBases) {
        this.firstBases = firstBases;
    }

    public void setSecondBases(double secondBases) {
        this.secondBases = secondBases;
    }

    @Override
    public double getArea() {
        return (firstBases + secondBases) / 2 * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, firstBase: " + firstBases + " units, secondBase: "
                + secondBases + " units, height: " + side + " units, color: " + getColor());
    }
}
