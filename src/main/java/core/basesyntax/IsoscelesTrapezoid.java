package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drowable, CalculateArea{
    private double baseA;
    private double baseB;
    private double side;

    public IsoscelesTrapezoid(double baseA, double baseB, double side) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getBaseA() {
        return this.baseA;
    }

    public void setBaseA(double baseA) {
        this.baseA = baseA;
    }

    public double getBasesB() {
        return this.baseB;
    }

    public void setBasesB(double baseB) {
        this.baseB = baseB;
    }

    public void draw() {
        System.out.println("This is IsoscelesTrapezoid with first base - "
        + this.baseA + ", second base - " + this.baseB
        + ", side - " + this.side
        + " and color - " + this.getColor());
    }

    public double area() {
        double height = Math.sqrt(
                side * side - Math.pow((baseA - baseB) / 2, 2)
        );
        return (baseA + baseB) * height / 2;
    }
}
