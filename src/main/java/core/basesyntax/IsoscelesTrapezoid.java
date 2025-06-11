package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double legFirst;
    private double legSecond;
    private double height;

    public IsoscelesTrapezoid(String color, double legFirst, double legSecond, double height) {
        super(color);
        this.legFirst = legFirst;
        this.legSecond = legSecond;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((legFirst + legSecond) * height) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, color: " + getColor() + " , leg 1: "
                + legFirst + "leg 2: " + legSecond + " ,heigh" + height
                + " , area: " + getArea());
    }
}
