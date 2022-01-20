package core.basesyntax;

public class Trapezoid extends Figure {
    private final double lowBase;
    private final double topBase;
    private final double height;

    public Trapezoid(String figure, String color, double lowBase, double topBase, double height) {
        super(figure, color);
        this.lowBase = lowBase;
        this.topBase = topBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (lowBase + topBase) * height;
    }

    @Override
    public void getInformation() {
        System.out.println("Figure : " + getFigure() + ", color : "
                + getColor() + ", topBase : " + topBase
                + " units, lowBase : " + lowBase + " units, height : " + height
                + " units, area : " + getArea() + " sq.units");
    }
}
