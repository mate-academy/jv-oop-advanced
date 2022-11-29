package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Drawing {
    private double sideA;
    private double sideB;
    private double sideH;

    public IsoscelesTrapezoid(double sideA, double sideB, double sideH, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideH = sideH;
        this.color = color;
    }

    public double getA() {
        return (sideA + sideB) / 2 * sideH;
    }

    public void setA(double a) {
        this.sideA = sideA;
    }

    public double getB() {
        return sideB;
    }

    public void setB(double b) {
        this.sideB = sideB;
    }

    public double getH() {
        return sideH;
    }

    public void setH(double h) {
        this.sideH = sideH;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * 2 * sideH;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid{" +
                "a=" + sideA +
                ", b=" + sideB +
                ", h=" + sideH +
                ", color='" + color + '\'' +
                '}';
    }
}
