package core.basesyntax;

public class IsoscelesTrapezoid extends FigureBase {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(Color color, double topBase, double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, top base: " + topBase
                + " units, bottom base: " + bottomBase + " units, height: "
                + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) / 2) * height;
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

}
