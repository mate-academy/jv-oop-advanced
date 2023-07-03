package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private static final double CONST_OF_AREA_EXPRESSION = 2;
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height, Color color) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height * (topBase + bottomBase) / CONST_OF_AREA_EXPRESSION;
    }

    @Override
    public void draw() {
        System.out.println(super.getClass().getSuperclass().getName()
                + ": isoscelesTrapezoid, "
                + "area: " + calculateArea() + " sq.units, "
                + "topBase: " + topBase + " units"
                + ", bottomBase: " + bottomBase + " units"
                + ", height:" + height + " units"
                + ", color: " + getColor().name());
    }
}
