package core.basesyntax;

public class Rectangle extends Figure {
    private double sideBig;
    private double sideSort;

    public Rectangle(String color, double sideBig, double sideSort) {
        super(new ColorSupplier().getRandomColor());
        if (sideBig > 0 && sideSort > 0 && sideBig > sideSort) {
            this.sideBig = sideBig;
            this.sideSort = sideSort;
        }
    }

    @Override
    public double getArea() {
        return sideBig * sideSort;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area " + getArea() + " sq.units, sideBig: " + sideBig
                + " units, sideShort: " + sideSort + " units, color: " + getColor());
    }
}
