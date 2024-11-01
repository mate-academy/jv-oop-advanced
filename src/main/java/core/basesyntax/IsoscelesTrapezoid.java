package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private int bottomBase;
    private int topBase;
    private int side;

    public IsoscelesTrapezoid(String color, String name, int bottomBase, int topBase, int side) {
        super(color, name);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return (int) (((bottomBase + topBase) / 2)
                * (Math.sqrt((Math.pow(side, 2))
                - Math.pow((((Math.pow((bottomBase - topBase), 2))
                + (Math.pow(side, 2)) - (Math.pow(side, 2)))
                / (2 * (bottomBase - topBase))), 2))));
    }

    @Override
    public String toString() {
        return "Figure:"
                + "name: "
                + super.getName()
                + ", "
                + "bottomBase: "
                + bottomBase
                + ", "
                + "topBase: "
                + topBase
                + ", "
                + "side: "
                + side
                + ", "
                + "area: "
                + calculateArea()
                + " sq. units, "
                + ", "
                + "color: "
                + super.getColor();
    }

}
