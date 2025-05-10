package core.basesyntax.model.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double baseA;
    private double baseB;
    private double side;

    public IsoscelesTrapezoid(double baseA, double baseB, double side, String color,
                              String identification) {
        super(color, identification);
        this.baseA = baseA;
        this.baseB = baseB;
        this.side = side;
    }

    public void setBaseA(double baseA) {
        this.baseA = baseA;
    }

    public void setBaseB(double baseB) {
        this.baseB = baseB;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getBaseA() {
        return baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", getArea: "
                + getArea() + " sq. units, baseA: " + baseA + " units, baseB: "
                + baseB + " units, side: " + side + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        double s = (baseA + baseB + side * side) / 2;
        return Math.sqrt(s * (s - baseA) * (s - baseB) * (s - side));
    }

}
