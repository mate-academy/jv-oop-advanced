package core.basesyntax.figures;

import core.basesyntax.utils.Color;

public class IsoscelesTrapezoid extends Figure {
    private double baseA;
    private double baseB;
    private double height;

    public IsoscelesTrapezoid(double baseA, double baseB, double height) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    public IsoscelesTrapezoid(Color color, double baseA, double baseB, double height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    public IsoscelesTrapezoid(double area, Color color, double baseA, double baseB, double height) {
        super(area, color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    public double getBaseA() {
        return baseA;
    }

    public void setBaseA(double baseA) {
        this.baseA = baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public void setBaseB(double baseB) {
        this.baseB = baseB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculate() {
        return (baseA + baseB) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, " + "area: " + calculate() + " sq. units, "
                + "topBase: " + (int) baseA
                + " units, bottomBase: " + (int) baseB
                + " units, height: " + (int) height
                + " units, color: " + getColor().toString().toLowerCase());
    }
}
