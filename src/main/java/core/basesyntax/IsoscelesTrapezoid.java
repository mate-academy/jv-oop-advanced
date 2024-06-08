package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;

    public IsoscelesTrapezoid(int topSide, int bottomSide, String color) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.setColor(color);
    }

    public void draw() {
        System.out.printf("Figure: isoscelesTrapezoid, topSide: "
                + topSide
                + ", bottomSide: "
                + bottomSide
                + ", color: "
                + getColor().toLowerCase()
                + "\n"
        );
    }
}
