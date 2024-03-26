package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return ((sideA + sideB) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.printf("""
                        -------------------
                        Figure: %s
                        Area: %f sq. units
                        Side A: %f units
                        Side B: %f units
                        Height: %f
                        Color: %s
                        """,
                this.getClass().getSimpleName(), calculateArea(), sideA, sideB, height, color);
    }
}
