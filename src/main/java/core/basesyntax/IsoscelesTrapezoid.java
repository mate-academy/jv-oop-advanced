package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static int DEFAULT_NUM = 2;
    private int baseFirst;
    private int baseSecond;
    private int height;

    public IsoscelesTrapezoid(Color color, int baseFirst, int baseSecond, int height) {
        super(color);
        this.baseFirst = baseFirst;
        this.baseSecond = baseSecond;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseFirst + baseSecond) / DEFAULT_NUM * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: + isoscelesTrapezoid, area: " + getArea() + ", baseFirst "
                + baseFirst + ", baseSecond " + baseSecond + ", height "
                + height + ", color: " + getColor());
    }
}
