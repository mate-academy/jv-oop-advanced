package core.basesyntax;

public class IsoscelesTrapezoid extends FigureAbstract implements Figure {
    private double side1;
    private double side2;
    private double side3;
    private double side4;
    public IsoscelesTrapezoid(String color, double side1, double side2, double side3, double side4) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    @Override
    public void draw() {
System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + "side1: " + side1 + ", side2: " + side2 + ", side3: " + side3 + ", side4: " + side4 + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return side1 * side2 * side3 *side4;
    }
}
