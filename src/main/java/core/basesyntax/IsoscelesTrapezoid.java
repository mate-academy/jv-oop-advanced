package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(Color color, double topBase, double bottomBase, double height) {
        super(color.name());
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("topBase: " + topBase + " units, bottomBase: "
                + bottomBase + " units, height: " + height + " units");
    }

    @Override
    public double getArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }
}
