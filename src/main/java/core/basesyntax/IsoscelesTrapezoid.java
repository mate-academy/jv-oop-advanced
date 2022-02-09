package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureArea, Draw {

    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(int topBase, int bottomBase, int height) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }


    @Override
    public String getDraw() {
        return null;
    }

    @Override
    public double getArea() {
        return ((topBase*bottomBase)/2)*height;
    }
}
