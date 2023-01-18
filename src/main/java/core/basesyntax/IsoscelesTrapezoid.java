package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, String name, int topBase, int bottomBase, int height) {
        super(color, name);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public void draw() {
        int area;
        area = (topBase + bottomBase) * height / 2;
        System.out.println("Figure: " + getName() + ",  area: " + area + "sq.units" + "  aSide: "
                + topBase + "units" + "  color: " + getColor());
    }
} //
