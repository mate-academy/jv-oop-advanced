package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topBase;
    private final int bottomBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: "
                + "Trapezoid"
                + " topBase: " + this.topBase
                + " bottomBase: " + this.bottomBase
                + " height: " + this.height
                + " color: " + this.color
        );
    }

    @Override
    public int getArea() {
        return (1 / 2) * (this.topBase + this.bottomBase) * this.height;
    }
}
