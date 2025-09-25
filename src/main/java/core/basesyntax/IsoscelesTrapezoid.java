package core.basesyntax;

public class IsoscelesTrapezoid extends FigureWithBottomAndHeight {
    private double top;

    public IsoscelesTrapezoid(String color, double bottom, double heigh, double top) {
        super(color, bottom, heigh);
        this.top = top;
        area = getArea();
    }

    @Override
    public double getArea() {
        return (width + top) * height / Constant.DIVISION_FOR_AREA;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + area + " sq. units, width: "
                + width + " units, height: " + height + " top: " + top + " color: "
                + color.toLowerCase());
    }
}
