package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseSide;

    private int topSide;

    private int hight;

    public IsoscelesTrapezoid(String color, int baseSide, int topSide, int hight) {
        super(color);
        this.baseSide = baseSide;
        this.topSide = topSide;
        this.hight = hight;
    }

    @Override
    public void getArea() {
        System.out.println((baseSide + topSide) / 2 * hight);
    }
}
