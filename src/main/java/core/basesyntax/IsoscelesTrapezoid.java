package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return ((upperBase + lowerBase) / 2) * height;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: IsoscelesTrapezoid, color: " + color
                + ", upperBase: " + upperBase + ", lowerBase: " + lowerBase
                + ", height: " + height + ", area: " + calculateArea());
    }
}
