package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstSide;
    private double secondSide;

    public IsoscelesTrapezoid(double height, double firstSide, double secondSide) {
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles Trapezoid, area: "
                + getArea() + " sq.units, height: "
                + getHeight() + " units, firstSide: "
                + getFirstSide() + " units, secondSide: "
                + getSecondSide() + " units, color: "
                + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }
}
