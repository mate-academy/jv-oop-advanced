package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private final double largeBase; // base 1
    private final double smallBase; // base 2
    private final double height; // height

    public IsoscelesTrapezoid(Color color, double largeBase, double smallBase, double height) {
        super(color);
        this.largeBase = largeBase;
        this.smallBase = smallBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (largeBase + smallBase) * height / 2;
    }

    @Override
    public void drawAFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, largeBase: " + largeBase + " units, smallBase: " + smallBase
                + " units, height: " + height + " units, color: "
                + getColor().name().toLowerCase());
    }
}
