package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowerBase;
    private int upperBase;
    private int height;

    public IsoscelesTrapezoid(Color color, int lowerBase, int upperBase, int height) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("This is Isosceles Trapezoid; Color: "
                + color + "; area: " + getArea() + ";");
    }

    @Override
    public double getArea() {
        return (lowerBase + upperBase) * height / 2;
    }
}
