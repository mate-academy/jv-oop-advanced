package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final double base;
    private final double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return Math.round((base * height / 2) * 10.0 / 10.0);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, area: "
                        + calculateArea()
                        + " sq. units, base: "
                        + base
                        + " units, height: "
                        + height
                        + " units, color: "
                        + color);
    }
}
