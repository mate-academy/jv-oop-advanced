package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowerBase;
    private int upperBase;
    private int side;

    public IsoscelesTrapezoid(String name, Color color, int lowerBase, int upperBase, int side) {
        super(name, color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.side = side;
    }

    @Override
    public int getArea() {
        return (int)(((lowerBase + upperBase) / 2)
                * (Math.sqrt(side * side - ((lowerBase - upperBase)
                * (lowerBase - upperBase)) / 4)));
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + "  sq. units,"
                + " lower base: " + lowerBase + " units,"
                + " upper base: " + upperBase + " units,"
                + " side: " + side + " units,"
                + " color: " + getColor());
    }
}
