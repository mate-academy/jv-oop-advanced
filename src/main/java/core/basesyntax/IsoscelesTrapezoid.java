package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowerBase;
    private int upperBase;
    private int height;

    public IsoscelesTrapezoid(int lowerBase, int upperBase, int height, String color) {
        this.height = height;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        setColor(color);
    }

    @Override
    public double getArea() {
        return ((lowerBase + upperBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println(("Figure: Isosceles Trapezoid, upper base: "
                + upperBase + ", lower base: " + lowerBase + ", height: "
                + height + ", area: " + getArea() + ", color: " + getColor()));
    }
}
