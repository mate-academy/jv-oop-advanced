package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomBase;
    private int topBase;
    private int height;

    IsoscelesTrapezoid(String color, int bottomBase, int topBase, int height) {
        super(color);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (this.topBase + this.bottomBase) / 2 * this.height;
    }

    @Override
    public String print() {
        return "Figure: isosceles trapezoid, area:"
                + " sq.units, top base: "
                + this.topBase
                + " units, bottom base: "
                + this.bottomBase
                + " units, height: "
                + this.height
                + " units, color: "
                + this.getColor();
    }
}
