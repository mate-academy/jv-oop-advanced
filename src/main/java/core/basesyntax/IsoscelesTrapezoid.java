package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;
    private double leg;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase,
                              double height, double leg) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
        this.leg = leg;
    }

    @Override
    public void draw() {
        super.draw();
    }
}
