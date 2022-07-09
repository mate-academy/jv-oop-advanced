package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int downside;
    private final int upside;
    private final int hight;

    public IsoscelesTrapezoid(String color, int downside, int upside, int hight) {
        super(color);
        this.downside = downside;
        this.upside = upside;
        this.hight = hight;
    }

    @Override
    public int getArea() {
        return
                (downside + upside) / 2 * hight;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: isosceles trapezoid; area: " + getArea() + " square units;"
                + " downside: " + downside + " units; "
                + " upside: " + upside + " units;"
                + " hight: " + hight + " units; "
                + getColor());
    }
}
