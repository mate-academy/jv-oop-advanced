package core.basesyntax;

public class Trapezoid extends Figure {
    private double baseA;
    private double baseB;
    private double leg;

    public Trapezoid(String color, double baseA, double baseB, double leg) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.leg = leg;
    }

    @Override
    public double area() {
    // https://en.wikipedia.org/wiki/Isosceles_trapezoid#Area
        return Math.sqrt(Math.pow(baseA + baseB, 2.0) * (baseA - baseB + leg*2) * (baseB - baseA + leg*2)) / 4.0;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + formatDouble(area(), 1) + " sq.units, base a: " + baseA + " units, "
                + "base b: " + baseB + " units, leg c: " + leg + "units, color: " + getColor();
    }

}
