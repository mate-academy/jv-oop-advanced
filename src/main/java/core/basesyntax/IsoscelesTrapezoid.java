package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomBase;
    private int upperBase;
    private int height;

    public IsoscelesTrapezoid(int bottomBase, int upperBase, int height) {
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upperBase + bottomBase) / 2 * height;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, "
                + "area: " + this.getArea() + " sq.units "
                + "upperBase: " + upperBase + " units "
                + "bottomBase: " + bottomBase + " units "
                + "height: " + height + " units "
                + "color: " + this.getColor();
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
