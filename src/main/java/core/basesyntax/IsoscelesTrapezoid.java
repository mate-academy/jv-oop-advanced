package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topBase;
    private final int bottomBase;
    private final int trapezoidHeight;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int trapezoidHeight) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.trapezoidHeight = trapezoidHeight;
    }

    @Override
    public double getFigureArea() {
        return (double) ((topBase + bottomBase) / 2) * trapezoidHeight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid "
                + "\n"
                + "Figure Area: "
                + getFigureArea()
                + "\n"
                + "TopBase: "
                + topBase
                + "\n"
                + "BottomBase: "
                + bottomBase
                + "\n"
                + "TrapezoidHeight: "
                + trapezoidHeight
                + "\n"
                + "Color: "
                + getColor()
                + "\n");
    }

}
