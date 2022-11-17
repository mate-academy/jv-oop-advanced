package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(Color color, int topBase, int bottomBase, int height) {
        super("isosceles trapezoid", color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double)((this.topBase + this.bottomBase) * this.height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getShape()
                + ", area: " + this.getArea()
                + " sq.units, top base: " + this.topBase
                + " units, bottom base: " + this.bottomBase
                + " units, height: " + this.height
                + " units, color: " + this.getColor());
    }
}
