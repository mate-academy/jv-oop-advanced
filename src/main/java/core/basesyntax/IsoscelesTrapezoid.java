package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowerBase;
    private int upperBase;
    private int side;

    public IsoscelesTrapezoid(int lowerBase, int upperBase, int sode, String color) {
        this.side = side;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        setColor(color);
    }

    @Override
    public double getArea() {
        return (lowerBase + upperBase) * Math.sqrt((side * side)
                - ((lowerBase - upperBase) * (lowerBase - upperBase)) / 4);
    }

    @Override
    public void draw() {
        System.out.println(("Figure: Isosceles Trapezoid, upper base: "
                + upperBase + ", lower base: " + lowerBase + ", side "
                + side + ", area: " + getArea() + ", color: " + getColor()));
    }
}
