package core.basesyntax.figures;

import core.basesyntax.abstractions.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final double baseA;
    private final double baseB;
    private final double height;

    public IsoscelesTrapezoid(String color, double baseA, double baseB, double height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((baseA + baseB) * 0.5) * height;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure"
                        + "isosceles trapezoid"
                        + ", area:"
                        + calculateArea()
                        + ", base A = "
                        + baseA
                        + ", base B = "
                        + baseB
                        + ", height = "
                        + height
                        + ", color: " + super.getColor());
    }
}
