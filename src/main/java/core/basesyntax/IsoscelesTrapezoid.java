package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomBase;
    private int upperBase;
    private int height;

    public IsoscelesTrapezoid(String color, int bottomBase, int upperBase, int height) {
        super(color);
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        double isoscelesTrapezoidArea = FORMULA_INDEX * (bottomBase + upperBase) * height;
        return getFormat(isoscelesTrapezoidArea);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureName.ISOSCELES_TRAPEZOID.name().toLowerCase()
                + ", area: " + getArea() + " sq. units, bottom base: " + bottomBase
                + ", upper base: " + upperBase + ", height: " + height
                + ", color: " + getColor().toLowerCase());
    }
}
