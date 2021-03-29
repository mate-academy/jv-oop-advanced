package core.basesyntax.model.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double baseA;
    private double baseB;
    private double side;

    public IsoscelesTrapezoid() {

    }

    public IsoscelesTrapezoid(double baseA, double baseB, double side) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.side = side;
        setIdentification("isosceles trapezoid");
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
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, baseA: " + baseA + " units, baseB: "
                + baseB + " units, side: " + side + " units, color: " + getColor());
    }

    @Override
    public double area() {
        double s = (baseA + baseB + side * side) / 2;
        return Math.sqrt(s * (s - baseA) * (s - baseB) * (s - side));
    }

    @Override
    public Figure getFigure() {
        return new IsoscelesTrapezoid(Math.random() * 50,
                Math.random() * 50, Math.random() * 50);
    }
}
