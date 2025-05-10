package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(int topBase, int bottomBase, int height, String color) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
        super.setColor(color);
    }

    @Override
    public void drawArea() {
        System.out.println(((topBase + bottomBase) * height) / 2);
    }
}
