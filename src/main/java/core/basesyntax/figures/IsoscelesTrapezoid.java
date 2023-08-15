package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int lowBase;
    private int highBase;
    private int leg;
    private int height;

    public IsoscelesTrapezoid(String color, int lowBase, int highBase, int leg, int height) {
        super(color);
        this.lowBase = lowBase;
        this.highBase = highBase;
        this.leg = leg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (lowBase + highBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area: " + getArea()
                + ", lowBase: " + lowBase
                + ", highBase: " + highBase
                + ", leg: " + leg
                + ", height: " + height
                + ", color: " + getColor()
                + "\n");
    }
}
