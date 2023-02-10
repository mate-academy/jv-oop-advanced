package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int hight;

    public IsoscelesTrapezoid(Color color, int topBase, int bottomBase, int hight) {
        setColor(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.hight = hight;
    }

    @Override
    public double calculateArea() {
        return (double) (topBase * bottomBase) / 2 * hight;
    }

    @Override
    public void draw() {
        System.out.println(System.lineSeparator()
                + "IsoscelesTrapezoid with area of " + calculateArea() + " sq. units");
        super.draw();
        System.out.println(System.lineSeparator() + "topBase:" + topBase
                + System.lineSeparator() + " bottomBase:" + bottomBase
                + System.lineSeparator() + "hight:" + hight
                + System.lineSeparator());
    }
}
