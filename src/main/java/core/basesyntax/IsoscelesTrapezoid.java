package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double base;
    private final double lateralSide;

    IsoscelesTrapezoid(String color, double base, double lateralSide) {
        super(color);

        this.base = base;
        this.lateralSide = lateralSide;
    }

    @Override
    public double getArea() {
        double firstLeg = base / 2;
        double height = Math.pow(lateralSide, 2) - Math.pow(firstLeg, 2);

        return base * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area: " + getArea() + " sq. units, base: "
                        + base + " units, lateral side: " + lateralSide + " units, color: " + color
        );
    }
}
