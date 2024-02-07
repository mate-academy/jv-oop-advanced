package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int topBase;
    private int bottomBase;

    public IsoscelesTrapezoid(String color, int height, int topBase, int bottomBase) {
        super(color);
        this.height = height;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    @Override
    public double calculateFigureArea() {
        return (double) height * (topBase + bottomBase) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + String.format("%.2f", calculateFigureArea())
                + " sq.units, top base: " + topBase + " units, bottom base: " + bottomBase
                + " units, height: " + height + " units, color: " + getColor());
    }
}
