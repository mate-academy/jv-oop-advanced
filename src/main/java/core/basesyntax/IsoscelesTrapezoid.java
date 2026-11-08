package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(Color color, int upperBase, int lowerBase, int height) {
        super(color);
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
        System.out.println("Figure: Isosceles Trapezoid, Figure upper base: "
                + upperBase
                + ", lower base: "
                + lowerBase
                + ", height:"
                + height
                + ", Area: "
                + getArea()
                + " Color: "
                + getColor());
    }
}
