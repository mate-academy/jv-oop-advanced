package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    public IsoscelesTrapezoid(double sideA,
                              double sideB,
                              double sideC,
                              double sideD,
                              String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * (Math.sqrt((sideC * sideC)
                - ((sideA - sideB) * (sideA - sideB)) / 4));
    }

    @Override
    public String draw() {
        return "Figure : Isosceles Trapezoid, area : " + getArea()
                + ", sideA : " + sideA
                + ", sideB : " + sideB
                + ", sideC : " + sideC
                + ", sideD : " + sideD
                + ", color : " + super.getColor();
    }
}
