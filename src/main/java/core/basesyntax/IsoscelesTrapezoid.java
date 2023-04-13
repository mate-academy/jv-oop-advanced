package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final int topSize;
    private final int bottomSize;
    private final int sideSize;

    public IsoscelesTrapezoid(int topSize, int bottomSize, int sideSize, Colors color) {
        super(Math.sqrt(Math.pow(topSize + bottomSize, 2)
                * (topSize - bottomSize + 2 * sideSize)
                * (bottomSize - topSize + 2 * sideSize)) / 4, color);
        this.topSize = topSize;
        this.bottomSize = bottomSize;
        this.sideSize = sideSize;

    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + getArea()
                + " sq.units, top side: "
                + getTopSize()
                + " units, bottom side: "
                + getBottomSize()
                + " units, lateral side: "
                + getSideSize()
                + " units, color: "
                + getColor().name().toLowerCase());
    }

    public int getTopSize() {
        return topSize;
    }

    public int getBottomSize() {
        return bottomSize;
    }

    public int getSideSize() {
        return sideSize;
    }
}
