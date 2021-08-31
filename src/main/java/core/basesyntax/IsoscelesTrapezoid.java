package core.basesyntax;

public class IsoscelesTrapezoid extends FigureSupplier implements Area, AreaDrawing {
    private double aside = getSide();
    private double bside = getSide();
    private double cside = getSide();

    @Override
    public double area() {
        double h = Math.sqrt(Math.pow(cside, 2) - Math.pow((aside - bside) / 2, 2));
        double trapezoidArea = 0.5 * (aside + bside) * h;
        return trapezoidArea;
    }

    @Override
    public String areaName() {
        String trapezoidName = "isosceles trapezoid";
        return trapezoidName;
    }

    public void trapezoidToShow() {
        String part1 = "Figure: " + areaName() + ", area: " + area() + " sq. units, bottom side: ";
        String part2 = aside + " units, top side: " + bside + " units, leg side: ";
        String part3 = cside + " units, color: " + getColors();
        System.out.println(part1 + part2 + part3);
    }
}
