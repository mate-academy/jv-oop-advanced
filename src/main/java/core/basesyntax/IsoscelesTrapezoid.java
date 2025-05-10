package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double aside;
    private double bside;
    private double cside;

    public IsoscelesTrapezoid(double side, String color) {
        this.aside = side;
        this.bside = side;
        this.cside = side;
        this.color = color;
    }

    @Override
    public double draw() {
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
        return "Figure: " + areaName() + ", area: " + draw()
                + " sq. units, bottom side: "
                + aside + " units, top side: " + bside + " units, leg side: "
                + cside + " units, color: " + color;

    }

}
