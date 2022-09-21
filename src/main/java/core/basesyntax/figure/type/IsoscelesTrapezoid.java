package core.basesyntax.figure.type;

public class IsoscelesTrapezoid extends Figure {
    private double size;
    private double firstBase;
    private double secondBase;

    public IsoscelesTrapezoid(String color, double lengthSize1, double lengthSize2,
                               double lengthSize3) {
        super(color);
        this.size = lengthSize1;
        this.firstBase = lengthSize2;
        this.secondBase = lengthSize3;
    }

    public double getLengthSize1() {
        return size;
    }

    public void setLengthSize1(double lengthSize1) {
        this.size = lengthSize1;
    }

    public double getLengthSize2() {
        return firstBase;
    }

    public void setLengthSize2(double lengthSize2) {
        this.firstBase = lengthSize2;
    }

    public double getLengthSize3() {
        return secondBase;
    }

    public void setLengthSize3(double lengthSize3) {
        this.secondBase = lengthSize3;
    }

    @Override
    public double getArea() {
        return ((size + firstBase) / 2) * secondBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure IsoscelesTrapezoid, measure: " + getArea()
                + ", Color: " + getColor());
    }
}
