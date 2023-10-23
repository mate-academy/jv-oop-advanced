package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int bottomBase;
    private int upperBase;

    public IsoscelesTrapezoid(int height, int bottomBase, int upperBase, String color) {
        super(color);
        this.height = height;
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
    }

    @Override
    public double getArea() {
        return (upperBase + bottomBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area " + getArea()
                + " sq.units, height: " + height
                + " units, bottomBase: " + bottomBase + " units, upperBase: "
                + upperBase + " units, color: " + super.getColor());
    }
}
