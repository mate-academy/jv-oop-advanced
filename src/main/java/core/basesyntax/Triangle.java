package core.basesyntax;

public class Triangle extends FigureSupplier implements Area, AreaDrawing {

    private double firstLeg = getSide();
    private double secondLeg = getSide();

    @Override
    public double area() {
        double triangleArea = (firstLeg * secondLeg) / 2;
        return triangleArea;
    }

    @Override
    public String areaName() {
        String triangleName = "triangle";
        return triangleName;
    }

    public void triangleToShow() {
        String part1 = "Figure: " + areaName() + ", area: " + area() + " sq. units, first Leg: ";
        String part2 = firstLeg + " units, second Leg: " + secondLeg;
        String part3 = " units, color: " + getColors();
        System.out.println(part1 + part2 + part3);
    }
}
