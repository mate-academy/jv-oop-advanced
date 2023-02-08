package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    public static final int MAX_TOP_BASE;
    public static final int MAX_BOTTOM_BASE;
    public static final int MAX_HIGHT;

    static {
        MAX_TOP_BASE = 100;
        MAX_BOTTOM_BASE = 100;
        MAX_HIGHT = 100;
    }

    private int topBase;
    private int bottomBase;
    private int hight;

    public IsoscelesTrapezoid(Color color, int topBase, int bottomBase, int hight) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.hight = hight;
    }

    @Override
    public int calculateArea() {
        return (topBase * bottomBase) / 2 * hight;
    }

    @Override
    public void draw() {
        System.out.println("\nIsoscelesTrapezoid with area of " + calculateArea() + " sq. units");
        super.draw();
        System.out.println("topBase:" + topBase
                 + " \nbottomBase:" + bottomBase
                 + " \nhight:" + hight);
    }
}
