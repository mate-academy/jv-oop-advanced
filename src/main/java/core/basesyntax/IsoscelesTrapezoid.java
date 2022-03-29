package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int hight;

    public IsoscelesTrapezoid(int firstSide, int secondSide, int hight) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return Math.rint((hight / 2) * (firstSide + secondSide));
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + getArea()
                + " sq.units, firs side: " + firstSide + ", second side: " + secondSide
                + " units, hight: " + hight + " units, color " + getColor());
    }

}
