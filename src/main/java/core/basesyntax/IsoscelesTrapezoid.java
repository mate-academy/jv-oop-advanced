package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private double baseA;
    private double baseB;
    private double height;
    private Color color;

    public IsoscelesTrapezoid(double baseA, double baseB, double height, Color color) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (baseA + baseB) * height / 2;
    }

    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.println("Figure: isosceles trapezoid, area: " + decimalFormat.format(getArea())
                + " sq.units, baseA: "
                + (int) baseA
                +
                " units, baseB: "
                + (int) baseB
                + " units, height: "
                + (int) height
                + " units, color: "
                + color);
    }
}
