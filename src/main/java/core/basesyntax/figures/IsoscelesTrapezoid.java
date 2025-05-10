package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return Math.round(((firstBase + secondBase) * height / 2) * 10.0 / 10.0);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area: "
                        + calculateArea()
                        + " sq. units, firstBase: "
                        + firstBase
                        + " units, secondBase: "
                        + secondBase
                        + " units, height: "
                        + height
                        + " units, color: "
                        + color);
    }
}
