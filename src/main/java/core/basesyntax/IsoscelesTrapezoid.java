package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private FigureSupplier side = new FigureSupplier();
    private double aside = side.getSide();
    private double bside = side.getSide();
    private double cside = side.getSide();

    @Override
    public double calculateArea() {
        double h = Math.sqrt(Math.pow(cside, 2) - Math.pow((aside - bside) / 2, 2));
        double trapezoidArea = 0.5 * (aside + bside) * h;
        return trapezoidArea;
    }

    @Override
    public String areaName() {
        String trapezoidName = this.getClass().getSimpleName();
        return trapezoidName;
    }

    @Override
    public String toString() {
        return "Figure: " + areaName() + ", area: " + calculateArea()
                + " sq. units, bottom side: "
                + aside + " units, top side: " + bside + " units, leg side: "
                + cside + " units, color: " + getColor();

    }

}
