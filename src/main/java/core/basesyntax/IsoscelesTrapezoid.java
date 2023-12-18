package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double base1;
    private double base2;
    private double leg;

    public IsoscelesTrapezoid(double base1, double base2, double leg, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.leg = leg;
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getLeg() {
        return leg;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid, area: "
                + ((int) (getArea() * 100) / 100.0) + " sq. units, base1: " + getBase1()
                + ", base2: " + getBase2()
                + ", leg: " + getLeg()
                + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        double partOfBase = Math.abs(base1 - base2) / 2.0;
        double height = Math.sqrt(Math.pow(leg, 2) - Math.pow(partOfBase,2));
        double resultArea = ((base1 + base2) / 2) * height;
        return resultArea;
    }
}
