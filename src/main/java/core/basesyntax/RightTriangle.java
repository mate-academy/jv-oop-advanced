package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double base;
    private final double height;

    public RightTriangle(String color, double firstLeg, double base, double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.base = base;
        this.height = height;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    @Override
    public double getArea() {
        return (base * height) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure : "
                        + "triangle,"
                        + " area : "
                        + getArea()
                        + " sq.units,"
                        + " firstLeg : "
                        + getFirstLeg()
                        + " units,"
                        + " units,"
                        + " color : "
                        + getColor());
    }
}
