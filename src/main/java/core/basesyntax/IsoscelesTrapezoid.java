package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        super(Color.valueOf(color));
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {

        return (double) ((upperBase + lowerBase) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq. units"
                + ", upper base: "
                + upperBase
                + " units"
                + ", lower base: "
                + lowerBase
                + " units"
                + ", height:"
                + height
                + " units"
                + ", color: "
                + getColor().name());
    }
}
