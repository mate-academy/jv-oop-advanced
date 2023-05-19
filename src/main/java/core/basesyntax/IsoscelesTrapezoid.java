package core.basesyntax;

public class IsoscelesTrapezoid extends FigureAbstract implements Figure {
    private final int upperBase;
    private final int lowerBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int lowerBase, int upperBase, int height) {
        this.color = color;
        this.height = height;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
    }

    @Override
    public double getArea() {
        return (double) ((upperBase + lowerBase) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure:IsoscelesTrapezoid," +
                "area:" + getArea() +
                " sq.units,lowerBase:" + lowerBase +
                " units,upperBase:" + upperBase +
                " units,height:" + height + " units,color:" + color);
    }
}
